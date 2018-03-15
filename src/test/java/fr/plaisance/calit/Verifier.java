package fr.plaisance.calit;

import java.util.stream.IntStream;

public class Verifier {

	public static void main(String[] args) {
		IntStream.range(1950, 2100).forEach(Calendriers::verifier);
	}
}
