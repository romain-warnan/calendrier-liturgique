package fr.plaisance.calit;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Dimanche extends DateLiturgique {

	private Dimanche(LocalDate date, String libelle, Couleur couleur) {
		super(date, libelle, couleur);
		verifierJourDeLaSemaine(DayOfWeek.SUNDAY, date);
	}
	
	static DateLiturgique of(LocalDate date, String libelle, Couleur couleur) {
		return new Dimanche(date, libelle, couleur);
	}
}
