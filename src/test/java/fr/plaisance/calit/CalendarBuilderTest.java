package fr.plaisance.calit;

import net.fortuna.ical4j.model.Calendar;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static fr.plaisance.calit.CalendrierLiturgique.deuxiemeDimancheDeCareme;
import static fr.plaisance.calit.CalendrierLiturgique.troisiemeDimancheDeCareme;

public class CalendarBuilderTest {

	@Test
	public void calendar() throws IOException {
		Calendar calendar = CalendarBuilder.build(Arrays.asList(troisiemeDimancheDeCareme(2018), deuxiemeDimancheDeCareme(2018)));
		Files.write(Paths.get("C:/Users/Romain/Desktop/romain.ics"), Arrays.asList(calendar.toString()), StandardCharsets.UTF_8);
	}
}
