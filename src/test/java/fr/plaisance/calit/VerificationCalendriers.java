package fr.plaisance.calit;

import java.util.stream.IntStream;

public class VerificationCalendriers {

	public static void main(String[] args) {
		IntStream.range(1000, 3000).forEach(Calendriers::verifier);
	}
}
