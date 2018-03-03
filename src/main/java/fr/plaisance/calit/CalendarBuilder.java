package fr.plaisance.calit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static fr.plaisance.calit.CalendrierLiturgique.premierDimancheAvent;
import static fr.plaisance.calit.CalendrierLiturgique.troisiemeDimancheDeCareme;

public class CalendarBuilder {

	public static void writeCalendar(String path) throws IOException {
		List<DateLiturgique> dates = Arrays.asList(premierDimancheAvent(2018), troisiemeDimancheDeCareme(2018));
		Files.write(Paths.get(path), calendarLines(dates), StandardCharsets.UTF_8);
	}

	private static List<String> calendarLines(List<DateLiturgique> dates) {
		List<String> lines = new ArrayList<>();
		lines.add("BEGIN:VCALENDAR");
		lines.add("PRODID:-//Romain Warnan//Solennités catholiques//FR");
		lines.add("VERSION:2.0");
		lines.add("CALSCALE:GREGORIAN");
		dates.stream()
			.map(CalendarBuilder::eventLines)
			.forEach(lines::addAll);
		lines.add("END:VCALENDAR");
		return lines;
	}

	private static List<String> eventLines(DateLiturgique dateLiturgique) {
		List<String> lines = new ArrayList<>();
		lines.add("BEGIN:VEVENT");
		// lines.add("DTSTAMP:20180303T104326Z");
		lines.add("DTSTART;VALUE=DATE:" + timestamp(dateLiturgique.date));
		lines.add("SUMMARY:" + dateLiturgique.libelle);
		lines.add("UID:" + generateUid());
		lines.add("END:VEVENT");
		return lines;
	}

	private static String timestamp(LocalDate date) {
		return date.atStartOfDay(ZoneId.systemDefault()).format(DateTimeFormatter.BASIC_ISO_DATE);
	}

	private static String generateUid() {
		return UUID.randomUUID().toString();
	}
}
