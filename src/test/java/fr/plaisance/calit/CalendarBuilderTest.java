package fr.plaisance.calit;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static fr.plaisance.calit.CalendrierLiturgique.*;

public class CalendarBuilderTest {

	@Test
	public void calendar() throws IOException {
		List<DateLiturgique> dates = Arrays.asList(
			premierDimancheAvent(2018),

			deuxiemeDimancheAvent(2018),
			troisiemeDimancheAvent(2018),
			quatriemeDimancheAvent(2018),
			troisiemeDimancheDeCareme(2018)
		);
		CalendarBuilder.writeCalendar("C:/Users/Romain/Desktop/romain.ics", dates);
	}
}
