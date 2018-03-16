package fr.plaisance.calit;

import fr.plaisance.calit.DateLiturgique.Couleur;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.TemporalAdjusters;

import static fr.plaisance.calit.OutilsDates.datePaques;

/**
 * Ordre de préséance des fêtes simplifié :
 * <ol>
 * 	<li>Triduum pascal de la Passion et de la Résurrection du Seigneur.</li>
 * 	<li>Nativité du Seigneur, Épiphanie, Ascension et Pentecôte. Dimanches de l’Avent, du Carême et de Pâques. Mercredi des Cendres. Jours de la semaine sainte, du lundi au jeudi inclus. Jours de l’octave de Pâques.</li>
 * 	<li>Solennités du Seigneur, de la bienheureuse Vierge Marie, des saints inscrits au calendrier général. Commémoration de tous les fidèles défunts.</li>
 * 	<li>Les fêtes du Seigneur inscrites au calendrier général.</li>
 * 	<li>Les dimanches du temps de Noël et les dimanches du Temps ordinaire.</li>
 * 	<li>Les fêtes de la bienheureuse Vierge Marie et des saints du calendrier général.</li>
 * <ol/>
 */
public class CalendrierLiturgique {

	public static DateLiturgique paques(int annee) {
		LocalDate date = datePaques(annee);
		return DateLiturgique.of(date, "paques", Couleur.BLANC, 1);
	}

	public static DateLiturgique cendres(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(6).minusDays(4);
		return DateLiturgique.of(date, "cendres", Couleur.VIOLET, 2);
	}

	public static DateLiturgique premierDimancheCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(6);
		return DateLiturgique.of(date, "careme.1", Couleur.VIOLET, 2);
	}

	public static DateLiturgique deuxiemeDimancheCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(5);
		return DateLiturgique.of(date, "careme.2", Couleur.VIOLET, 2);
	}

	public static DateLiturgique troisiemeDimancheCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(4);
		return DateLiturgique.of(date, "careme.3", Couleur.VIOLET, 2);
	}

	public static DateLiturgique quatriemeDimancheCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(3);
		return DateLiturgique.of(date, "careme.4", Couleur.ROSE, 2);
	}

	public static DateLiturgique cinquiemeDimancheCareme(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(2);
		return DateLiturgique.of(date, "careme.5", Couleur.VIOLET, 2);
	}

	public static DateLiturgique rameaux(int annee) {
		LocalDate date = datePaques(annee).minusWeeks(1);
		return DateLiturgique.of(date, "rameaux", Couleur.ROUGE, 2);
	}


	public static DateLiturgique jeudiSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(3);
		return DateLiturgique.of(date, "jeudi.saint", Couleur.BLANC, 2);
	}


	public static DateLiturgique vendrediSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(2);
		return DateLiturgique.of(date, "vendredi.saint", Couleur.ROUGE, 1);
	}


	public static DateLiturgique samediSaint(int annee) {
		LocalDate date = datePaques(annee).minusDays(1);
		return DateLiturgique.of(date, "samedi.saint", Couleur.BLANC, 1);
	}

	public static DateLiturgique divineMisericorde(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(1);
		return DateLiturgique.of(date, "divine.misericorde", Couleur.BLANC, 2);
	}
	
	public static DateLiturgique troisiemeDimanchePaques(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(2);
		return DateLiturgique.of(date, "paques.3", Couleur.BLANC, 2);
	}
	
	public static DateLiturgique quatriemeDimanchePaques(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(3);
		return DateLiturgique.of(date, "paques.4", Couleur.BLANC, 2);
	}
	
	public static DateLiturgique cinquiemeDimanchePaques(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(4);
		return DateLiturgique.of(date, "paques.5", Couleur.BLANC, 2);
	}
	
	public static DateLiturgique sixiemeDimanchePaques(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(5);
		return DateLiturgique.of(date, "paques.6", Couleur.BLANC, 2);
	}
	
	public static DateLiturgique septiemeDimanchePaques(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(6);
		return DateLiturgique.of(date, "paques.7", Couleur.BLANC, 2);
	}

	public static DateLiturgique ascension(int annee) {
		LocalDate date = datePaques(annee).plusDays(39);
		return DateLiturgique.of(date, "ascension", Couleur.BLANC, 2);
	}

	public static DateLiturgique pentecote(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(7);
		return DateLiturgique.of(date, "pentecote", Couleur.ROUGE, 2);
	}

	public static DateLiturgique sainteTrinite(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(8);
		return DateLiturgique.of(date, "sainte.trinite", Couleur.BLANC, 3);
	}

	public static DateLiturgique feteDieu(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(9);
		return DateLiturgique.of(date, "fete.dieu", Couleur.BLANC, 3);
	}

	public static DateLiturgique sacreCoeur(int annee) {
		LocalDate date = datePaques(annee).plusWeeks(9).plusDays(5);
		return DateLiturgique.of(date, "sacre.coeur", Couleur.BLANC, 3);
	}

	public static DateLiturgique christRoi(int annee) {
		LocalDate date = dateQuatriemeDimancheAvent(annee).minusWeeks(4);
		return DateLiturgique.of(date, "christ.roi", Couleur.BLANC, 3);
	}

	private static LocalDate dateQuatriemeDimancheAvent(int annee) {
		LocalDate noel = noel(annee).getDate();
		return noel.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
	}

	public static DateLiturgique premierDimancheAvent(int annee) {
		LocalDate date = dateQuatriemeDimancheAvent(annee).minusWeeks(3);
		return DateLiturgique.of(date, "avent.1", Couleur.VIOLET, 2);
	}

	public static DateLiturgique deuxiemeDimancheAvent(int annee) {
		LocalDate date = dateQuatriemeDimancheAvent(annee).minusWeeks(2);
		return DateLiturgique.of(date, "avent.2", Couleur.VIOLET, 2);
	}

	public static DateLiturgique troisiemeDimancheAvent(int annee) {
		LocalDate date = dateQuatriemeDimancheAvent(annee).minusWeeks(1);
		return DateLiturgique.of(date, "avent.3", Couleur.ROSE, 2);
	}

	public static DateLiturgique quatriemeDimancheAvent(int annee) {
		LocalDate date = dateQuatriemeDimancheAvent(annee);
		return DateLiturgique.of(date, "avent.4", Couleur.VIOLET, 2);
	}

	public static DateLiturgique immaculeeConception(int annee) {
		LocalDate date = LocalDate.of(annee, Month.DECEMBER, 8);
		if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			date = date.plusDays(1);
		}
		return DateLiturgique.of(date, "immaculee.conception", Couleur.BLANC, 3);
	}

	public static DateLiturgique saintJoseph(int annee) {
		LocalDate date = LocalDate.of(annee, Month.MARCH, 19);
		if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			date = date.plusDays(1);
		}
		DateLiturgique saintJoseph = DateLiturgique.of(date, "saint.joseph", Couleur.BLANC, 3);
		if(saintJoseph.memeJourQue(jeudiSaint(annee))) {
			saintJoseph.setDate(LocalDate.of(annee, Month.MARCH, 14));
		}
		return saintJoseph;
	}

	public static DateLiturgique annonciation(int annee) {
		LocalDate date = LocalDate.of(annee, Month.MARCH, 25);
		LocalDate paques = datePaques(annee);
		if(!paques.minusWeeks(1).isAfter(date) && !paques.isBefore(date)) {
			date = paques.plusWeeks(1).plusDays(1);
		}
		else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			date = date.plusDays(1);
		}
		return DateLiturgique.of(date, "annonciation", Couleur.BLANC, 3);
	}

	public static DateLiturgique epiphanie(int annee) {
		LocalDate date = LocalDate.of(annee, Month.JANUARY, 1).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		return DateLiturgique.of(date, "epiphanie", Couleur.BLANC, 2);
	}

    public static DateLiturgique nativiteStJeanBaptiste(int annee) {
        MonthDay date = MonthDay.of(Month.JUNE, 24);
		DateLiturgique nativiteStJeanBaptiste =  DateLiturgique.fixe(date, annee, "nativite.de.saint.jean.baptiste", Couleur.BLANC, 3);
		if (nativiteStJeanBaptiste.memeJourQue(sacreCoeur(annee), feteDieu(annee))) {
			return null;
		}
		return nativiteStJeanBaptiste;
    }

	public static DateLiturgique sainteMarieMereDeDieu(int annee) {
		MonthDay date = MonthDay.of(Month.JANUARY, 1);
		return DateLiturgique.fixe(date, annee, "sainte.marie", Couleur.BLANC, 3);
	}

	public static DateLiturgique assomption(int annee) {
		MonthDay date = MonthDay.of(Month.AUGUST, 15);
		return DateLiturgique.fixe(date, annee, "assomption", Couleur.BLANC, 3);
	}

	public static DateLiturgique toussaint(int annee) {
		MonthDay date = MonthDay.of(Month.NOVEMBER, 1);
		return DateLiturgique.fixe(date, annee, "toussaint", Couleur.BLANC, 3);
	}

	public static DateLiturgique jourDesMorts(int annee) {
		MonthDay date = MonthDay.of(Month.NOVEMBER, 2);
		return DateLiturgique.fixe(date, annee, "jour.des.morts", Couleur.VIOLET, 3);
	}

	public static DateLiturgique noel(int annee) {
		MonthDay date = MonthDay.of(Month.DECEMBER, 25);
		return DateLiturgique.fixe(date, annee, "noel", Couleur.BLANC, 2);
	}

    public static DateLiturgique saintsPierreEtPaul(int annee) {
        MonthDay date = MonthDay.of(Month.JUNE, 29);
		DateLiturgique saintsPierreEtPaul =  DateLiturgique.fixe(date, annee, "pierre.paul", Couleur.ROUGE, 3);
		if (saintsPierreEtPaul.memeJourQue(sacreCoeur(annee))) {
			return null;
		}
		return saintsPierreEtPaul;
    }

    // Fêtes

	// Fêtes mobiles
	public static DateLiturgique sainteFamille(int annee) {
		LocalDate noel = noel(annee).getDate();
		LocalDate dernierDimanche = LocalDate.of(annee, Month.DECEMBER, 1).with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		LocalDate date = noel.equals(dernierDimanche) ? MonthDay.of(Month.DECEMBER, 30).atYear(annee) : dernierDimanche;
		return DateLiturgique.of(date, "sainte.famille", Couleur.BLANC, 4);
	}

	public static DateLiturgique baptemeDuSeigneur(int annee) {
		LocalDate date = epiphanie(annee).getDate().plusDays(1);
		return DateLiturgique.of(date, "bapteme.du.seigneur", Couleur.BLANC, 4);
	}

	// Fêtes fixes
	// du Seigneur
	public static DateLiturgique presentationAuTemple(int annee) {
		MonthDay date = MonthDay.of(Month.FEBRUARY, 2);
		return DateLiturgique.fixe(date, annee, "presentation.au.temple", Couleur.BLANC, 4);
	}

	public static DateLiturgique transfiguration(int annee) {
		MonthDay date = MonthDay.of(Month.AUGUST, 6);
		return DateLiturgique.fixe(date, annee, "transfiguration", Couleur.BLANC, 4);
	}

	// de la Vierge Marie
	public static DateLiturgique visitation(int annee) {
		MonthDay date = MonthDay.of(Month.MAY, 31);
		DateLiturgique visitation = DateLiturgique.fixe(date, annee, "visitation", Couleur.BLANC, 6);
		if(visitation.getDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
			return null;
		}
		if (visitation.memeJourQue(ascension(annee), sacreCoeur(annee))) {
			return null;
		}
		return visitation;
	}

	public static DateLiturgique nativiteViergeMarie(int annee) {
		MonthDay date = MonthDay.of(Month.SEPTEMBER, 8);
		DateLiturgique nativiteViergeMarie = DateLiturgique.fixe(date, annee, "nativite.marie", Couleur.BLANC, 6);
		if(nativiteViergeMarie.getDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
			return null;
		}
		return nativiteViergeMarie;
	}
}
