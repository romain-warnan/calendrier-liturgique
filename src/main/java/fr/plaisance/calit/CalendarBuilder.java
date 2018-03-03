package fr.plaisance.calit;

import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Version;
import net.fortuna.ical4j.util.RandomUidGenerator;
import net.fortuna.ical4j.util.UidGenerator;

import java.time.ZoneId;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class CalendarBuilder {

	private static final UidGenerator uidGenerator = new RandomUidGenerator();

	public static Calendar build(List<DateLiturgique> dates) {
		Calendar calendar = calendar();
		dates.stream()
			.map(CalendarBuilder::evenement)
			.collect(toCollection(calendar::getComponents));
		return calendar;
	}

	private static Calendar calendar() {
		Calendar calendar = new Calendar();
		calendar.getProperties().add(new ProdId("-//Romain Warnan//Solennités catholiques//FR"));
		calendar.getProperties().add(Version.VERSION_2_0);
		calendar.getProperties().add(CalScale.GREGORIAN);
		return calendar;
	}

	private static VEvent evenement(DateLiturgique date) {
		long millis = date.date.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
		Date eventDate = new Date(millis);
		VEvent event = new VEvent(eventDate, date.libelle);
		event.getProperties().add(uidGenerator.generateUid());
		return event;
	}
}
