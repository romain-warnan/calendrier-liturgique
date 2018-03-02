package fr.plaisance.calit;

import java.time.ZoneId;
import java.util.Date;

import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Version;

public class CalendarBuilder {

	
	public Calendar build() {
		Calendar calendar = new Calendar();
		calendar.getProperties().add(new ProdId("-//Romain Warnan//Solennités catholiques//FR"));
		calendar.getProperties().add(Version.VERSION_2_0);
		calendar.getProperties().add(CalScale.GREGORIAN);
		return calendar;
	}
	
	private VEvent evenement(DateLiturgique date) {
		Date eventDate = Date.from(date.date.atStartOfDay(ZoneId.systemDefault()).toInstant());
		VEvent event = new VEvent(eventDate, date.libelle);
	}
}
