package fr.plaisance.calit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import fr.plaisance.calit.DateLiturgique.Couleur;

public class CalendrierLiturgique {

	public static DateLiturgique paques(int annee) {
		int joursDeMars = algorithmeDeGauss(annee);
		LocalDate date = LocalDate.of(annee, Month.MARCH, 1).plusDays(joursDeMars - 1); 
		return Dimanche.of(date, "Pâques", Couleur.BLANC);
	}

	public static DateLiturgique mercrediDesCendres(int annee) {
		LocalDate date = paques(annee).date.minusDays(46);
		return Fete.of(date, "Mercredi des cendres", Couleur.VIOLET, DayOfWeek.WEDNESDAY);
	}

	public static DateLiturgique premierDimancheDeCareme(int annee) {
		LocalDate date = paques(annee).date.minusDays(42 - 7 * 0);
		return Dimanche.of(date, "1er dimanche de Carême (Invocabit)", Couleur.VIOLET);
	}
	
	public static DateLiturgique deuxiemeDimancheDeCareme(int annee) {
		LocalDate date = paques(annee).date.minusDays(42 - 7 * 1);
		return Dimanche.of(date, "2e dimanche de Carême (Reminiscere)", Couleur.VIOLET);
	}
	
	public static DateLiturgique troisiemeDimancheDeCareme(int annee) {
		LocalDate date = paques(annee).date.minusDays(42 - 7 * 2);
		return Dimanche.of(date, "3e dimanche de Carême (Oculi)", Couleur.VIOLET);
	}
	
	public static DateLiturgique quatriemeDimancheDeCareme(int annee) {
		LocalDate date = paques(annee).date.minusDays(42 - 7 * 3);
		return Dimanche.of(date, "4e dimanche de Carême (Lætare)", Couleur.ROSE);
	}
	
	public static DateLiturgique cinquiemeDimancheDeCareme(int annee) {
		LocalDate date = paques(annee).date.minusDays(42 - 7 * 4);
		return Dimanche.of(date, "5e dimanche de Carême (Judica)", Couleur.VIOLET);
	}
	
	private static int algorithmeDeGauss(int annee) {
		final int a = annee % 19;
		final int b = annee % 4;
		final int c = annee % 7;
		final int k = annee / 100;
		final int p = (13 + 8 * k) / 25;
		final int q = k / 4;
		final int M = (15 - p + k - q) % 30;
		final int N = (4 + k - q) % 7;
		final int d = (19 * a + M) % 30;
		final int e = (2 * b + 4 * c + 6 * d + N) % 7;
		
		if(d == 29 && e == 6) {
			return 19 + 31;
		}
		if(d == 28 && e == 6 && (11 * M + 11) / 30 < 19) {
			return 18 + 31;
		}
		return 22 + d + e;
	}
}
