package fr.plaisance.calit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CalendrierFabrique {

	public static void creerCalendrier(String path, List<DateLiturgique> dates) throws IOException {
		Files.write(Paths.get(path), lignesCalendrier(dates), StandardCharsets.UTF_8);
	}

	private static List<String> lignesCalendrier(List<DateLiturgique> dates) {
		List<String> lines = new ArrayList<>();
		lines.add("BEGIN:VCALENDAR");
		lines.add("PRODID:-//Romain Warnan//Solennités et fêtes catholiques//FR");
		lines.add("VERSION:2.0");
		lines.add("CALSCALE:GREGORIAN");
		dates.stream()
			.map(CalendrierFabrique::lignesEvenement)
			.forEach(lines::addAll);
		lines.add("END:VCALENDAR");
		return lines;
	}

	private static List<String> lignesEvenement(DateLiturgique dateLiturgique) {
		List<String> lines = new ArrayList<>();
		lines.add("BEGIN:VEVENT");
		lines.add("DTSTART;VALUE=DATE:" + dateIso(dateLiturgique.getDate()));
		lines.add("SUMMARY:" + dateLiturgique.getLibelle());
		lines.add("TRANSP:TRANSPARENT");
		lines.add("UID:" + genererUID());
		lines.add("CATEGORIES:" + dateLiturgique.getCouleur());
		lines.add("END:VEVENT");
		return lines;
	}

	private static String dateIso(LocalDate date) {
		return date.atStartOfDay(ZoneId.systemDefault()).format(DateTimeFormatter.BASIC_ISO_DATE);
	}

	private static String genererUID() {
		return UUID.randomUUID().toString();
	}
}
