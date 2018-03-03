package fr.plaisance.calit;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static fr.plaisance.calit.CalendrierLiturgique.*;

public class CalendarBuilderTest {

	@Test
	public void calendar() throws IOException {
		int annee = 2018;
		List<DateLiturgique> solennites = Arrays.asList(
			premierDimancheAvent(annee),
			immaculeeConception(annee),
			deuxiemeDimancheAvent(annee),
			troisiemeDimancheAvent(annee),
			quatriemeDimancheAvent(annee),
			noel(annee),
			sainteMarieMereDeDieu(annee),
			epiphanie(annee),
			premierDimancheCareme(annee),
			deuxiemeDimancheCareme(annee),
			troisiemeDimancheCareme(annee),
			quatriemeDimancheCareme(annee),
			cinquiemeDimancheCareme(annee),
			saintJoseph(annee),
			jeudiSaint(annee),
			vendrediSaint(annee),
			samediSaint(annee),
			paques(annee),
			/*Solennité de l’Annonciation du Seigneur à Marie, le 25 mars. Est décalée au 26, si le 25 est un dimanche (ou le premier lundi qui suit le deuxième dimanche de Pâques si le 25 mars se situe pendant la Semaine Sainte).*/
			christRoi(annee)
		);
		CalendarBuilder.writeCalendar("C:/Users/Romain/Desktop/romain.ics", solennites);
	}
}
