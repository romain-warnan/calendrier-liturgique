package fr.plaisance.calit;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static fr.plaisance.calit.CalendrierLiturgique.*;

public class CalendrierFabriqueTest {

	@Test
	public void calendar() throws IOException {
		int annee = 2018;
		List<DateLiturgique> dateLiturgiques = Arrays.asList(
			immaculeeConception(annee),
			premierDimancheAvent(annee),
			deuxiemeDimancheAvent(annee),
			troisiemeDimancheAvent(annee),
			quatriemeDimancheAvent(annee),
			noel(annee),
			sainteMarieMereDeDieu(annee),
			epiphanie(annee),
			saintJoseph(annee),
			cendres(annee),
			premierDimancheCareme(annee),
			deuxiemeDimancheCareme(annee),
			troisiemeDimancheCareme(annee),
			quatriemeDimancheCareme(annee),
			cinquiemeDimancheCareme(annee),
			rameaux(annee),
			jeudiSaint(annee),
			vendrediSaint(annee),
			samediSaint(annee),
			paques(annee),
			annonciation(annee),
			ascension(annee),
			pentecote(annee),
			sainteTrinite(annee),
			feteDieu(annee),
			sacreCoeur(annee),
			nativiteStJeanBaptiste(annee),
			saintsPierreEtPaul(annee),
			assomption(annee),
			toussaint(annee),
			jourDesMorts(annee),
			christRoi(annee),
			// Fêtes
			baptemeDuSeigneur(annee),
			presentationAuTemple(annee),
			sainteFamille(annee),
			transfiguration(annee),
			visitation(annee),
			nativiteViergeMarie(annee)
		);

		CalendrierFabrique.creerCalendrier("docs/solennites-" + annee + ".ics", dateLiturgiques);
	}
}