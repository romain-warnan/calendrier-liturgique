package fr.plaisance.calit;

import java.time.LocalDate;
import java.time.MonthDay;

public class DateLiturgique {

	enum Couleur {
		VIOLET, ROSE, BLANC, VERT, ROUGE
	}

	LocalDate date;
	String libelle;
	Couleur couleur;

	private DateLiturgique(LocalDate date, String libelle, Couleur couleur) {
		this.date = date;
		this.libelle = libelle;
		this.couleur = couleur;
	}

	static DateLiturgique of(LocalDate date, String libelle, Couleur couleur) {
		return new DateLiturgique(date, libelle, couleur);
	}

	static DateLiturgique fixe(MonthDay date, int annee, String libelle, Couleur couleur) {
		return new DateLiturgique(date.atYear(annee), libelle, couleur);
	}
}
