package fr.plaisance.calit;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

@SuppressWarnings("serial")
public class MauvaisJourException extends RuntimeException {

	public MauvaisJourException(DayOfWeek expected, DayOfWeek actual) {
		super(String.format("Devrait tomber un %s, pas un %s", jour(expected), jour(actual)));
	}
	
	private static String jour(DayOfWeek dayOfWeek) {
		return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.FRENCH).toLowerCase();
	}
}
