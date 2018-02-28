package fr.plaisance.calit;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class DateLiturgique {

	enum Couleur {
		VIOLET, ROSE, BLANC, VERT, ROUGE
	}
	
	LocalDate date;
	String libelle;
	Couleur couleur;

	protected DateLiturgique(LocalDate date, String libelle, Couleur couleur) {
		this.date = date;
		this.libelle = libelle;
	}
	
	protected static void verifierJourDeLaSemaine(DayOfWeek expected, LocalDate date) {
		DayOfWeek actual = date.getDayOfWeek();
		if (expected != actual) {
			throw new JourDeLaSemaineException(expected, actual);
		}
	}
}
