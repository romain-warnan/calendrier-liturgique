package fr.plaisance.calit;

import org.junit.Test;

import java.io.IOException;

public class CalendarBuilderTest {

	@Test
	public void calendar() throws IOException {
		CalendarBuilder.writeCalendar("C:/Users/Romain/Desktop/romain.ics");
	}
}
