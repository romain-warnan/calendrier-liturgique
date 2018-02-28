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
	
	private static LocalDate datePaques(int annee) {
		return paques(annee).date;
	}

	public static DateLiturgique cendres(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(6).minusDays(4);
		return Fete.of(date, "Mercredi des cendres", Couleur.VIOLET, DayOfWeek.WEDNESDAY);
	}

	public static DateLiturgique premierDimancheDeCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(6);
		return Dimanche.of(date, "1er dimanche de Carême (Invocabit)", Couleur.VIOLET);
	}
	
	public static DateLiturgique deuxiemeDimancheDeCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(5);
		return Dimanche.of(date, "2e dimanche de Carême (Reminiscere)", Couleur.VIOLET);
	}
	
	public static DateLiturgique troisiemeDimancheDeCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(4);
		return Dimanche.of(date, "3e dimanche de Carême (Oculi)", Couleur.VIOLET);
	}
	
	public static DateLiturgique quatriemeDimancheDeCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(3);
		return Dimanche.of(date, "4e dimanche de Carême (Lætare)", Couleur.ROSE);
	}
	
	public static DateLiturgique cinquiemeDimancheDeCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(2);
		return Dimanche.of(date, "5e dimanche de Carême (Judica)", Couleur.VIOLET);
	}

	public static DateLiturgique rameaux(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(1);
		return Dimanche.of(date, "Dimanche de la Passion et des Rameaux", Couleur.ROUGE);
	}


	public static DateLiturgique jeudiSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(3);
		return Fete.of(date, "Jeudi Saint", Couleur.BLANC, DayOfWeek.THURSDAY);
	}
	

	public static DateLiturgique vendrediSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(2);
		return Fete.of(date, "Vendredi Saint", Couleur.ROUGE, DayOfWeek.FRIDAY);
	}
	

	public static DateLiturgique samediSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(1);
		return Fete.of(date, "Samedi Saint", Couleur.VIOLET, DayOfWeek.SATURDAY);
	}

	public static DateLiturgique ascension(int annee) {
		LocalDate date = datePaques(annee).plusDays(39);
		return Fete.of(date, "Ascension", Couleur.BLANC, DayOfWeek.THURSDAY);
	}
	
	public static DateLiturgique pentecote(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(7);
		return Dimanche.of(date, "Pentecôte", Couleur.ROUGE);
	}
	
	public static DateLiturgique sainteTrinite(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(8);
		return Dimanche.of(date, "Sainte Trinité", Couleur.BLANC);
	}
	
	public static DateLiturgique feteDieu(int annee) {
		LocalDate date = datePaques(annee).plusDays(60);
		return Fete.of(date, "Fête-Dieu", Couleur.BLANC, DayOfWeek.THURSDAY);
	}
	
	// Visitation 31 mai
	
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
