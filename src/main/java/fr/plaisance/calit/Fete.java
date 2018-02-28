package fr.plaisance.calit;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fete extends DateLiturgique {

	private Fete(LocalDate date, String libelle, Couleur couleur) {
		super(date, libelle, couleur);
	}
	
	private Fete(LocalDate date, String libelle, Couleur couleur, DayOfWeek expected) {
		super(date, libelle, couleur);
		verifierJourDeLaSemaine(expected, date);
	}
	
	static DateLiturgique of(LocalDate date, String libelle, Couleur couleur) {
		return new Fete(date, libelle, couleur);
	}
	
	static DateLiturgique of(LocalDate date, String libelle, Couleur couleur, DayOfWeek expected) {
		return new Fete(date, libelle, couleur, expected);
	}
}
