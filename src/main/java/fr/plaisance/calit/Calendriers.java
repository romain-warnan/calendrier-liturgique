package fr.plaisance.calit;

import static fr.plaisance.calit.CalendrierLiturgique.annonciation;
import static fr.plaisance.calit.CalendrierLiturgique.ascension;
import static fr.plaisance.calit.CalendrierLiturgique.assomption;
import static fr.plaisance.calit.CalendrierLiturgique.baptemeDuSeigneur;
import static fr.plaisance.calit.CalendrierLiturgique.cendres;
import static fr.plaisance.calit.CalendrierLiturgique.christRoi;
import static fr.plaisance.calit.CalendrierLiturgique.cinquiemeDimancheCareme;
import static fr.plaisance.calit.CalendrierLiturgique.cinquiemeDimanchePaques;
import static fr.plaisance.calit.CalendrierLiturgique.deuxiemeDimancheAvent;
import static fr.plaisance.calit.CalendrierLiturgique.deuxiemeDimancheCareme;
import static fr.plaisance.calit.CalendrierLiturgique.divineMisericorde;
import static fr.plaisance.calit.CalendrierLiturgique.epiphanie;
import static fr.plaisance.calit.CalendrierLiturgique.feteDieu;
import static fr.plaisance.calit.CalendrierLiturgique.immaculeeConception;
import static fr.plaisance.calit.CalendrierLiturgique.jeudiSaint;
import static fr.plaisance.calit.CalendrierLiturgique.jourDesMorts;
import static fr.plaisance.calit.CalendrierLiturgique.nativiteStJeanBaptiste;
import static fr.plaisance.calit.CalendrierLiturgique.nativiteViergeMarie;
import static fr.plaisance.calit.CalendrierLiturgique.noel;
import static fr.plaisance.calit.CalendrierLiturgique.paques;
import static fr.plaisance.calit.CalendrierLiturgique.pentecote;
import static fr.plaisance.calit.CalendrierLiturgique.premierDimancheAvent;
import static fr.plaisance.calit.CalendrierLiturgique.premierDimancheCareme;
import static fr.plaisance.calit.CalendrierLiturgique.presentationAuTemple;
import static fr.plaisance.calit.CalendrierLiturgique.quatriemeDimancheAvent;
import static fr.plaisance.calit.CalendrierLiturgique.quatriemeDimancheCareme;
import static fr.plaisance.calit.CalendrierLiturgique.quatriemeDimanchePaques;
import static fr.plaisance.calit.CalendrierLiturgique.rameaux;
import static fr.plaisance.calit.CalendrierLiturgique.sacreCoeur;
import static fr.plaisance.calit.CalendrierLiturgique.saintJoseph;
import static fr.plaisance.calit.CalendrierLiturgique.sainteFamille;
import static fr.plaisance.calit.CalendrierLiturgique.sainteMarieMereDeDieu;
import static fr.plaisance.calit.CalendrierLiturgique.sainteTrinite;
import static fr.plaisance.calit.CalendrierLiturgique.saintsPierreEtPaul;
import static fr.plaisance.calit.CalendrierLiturgique.samediSaint;
import static fr.plaisance.calit.CalendrierLiturgique.septiemeDimanchePaques;
import static fr.plaisance.calit.CalendrierLiturgique.sixiemeDimanchePaques;
import static fr.plaisance.calit.CalendrierLiturgique.toussaint;
import static fr.plaisance.calit.CalendrierLiturgique.transfiguration;
import static fr.plaisance.calit.CalendrierLiturgique.troisiemeDimancheAvent;
import static fr.plaisance.calit.CalendrierLiturgique.troisiemeDimancheCareme;
import static fr.plaisance.calit.CalendrierLiturgique.troisiemeDimanchePaques;
import static fr.plaisance.calit.CalendrierLiturgique.vendrediSaint;
import static fr.plaisance.calit.CalendrierLiturgique.visitation;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calendriers {
	
	static void verifier(int annee) {
		List<DateLiturgique> calendrier = solennitesFetesDuSeigneurEtDeLaVierge(annee);
		for (int i = 0; i < calendrier.size() - 1; i ++) {
			for (int j = i + 1; j < calendrier.size(); j ++) {
				DateLiturgique a = calendrier.get(i);
				DateLiturgique b = calendrier.get(j);
				if(b == null) {
					System.out.println(j);
				}
				if(a.pasDeDate()) {
					System.out.println(String.format("En %d, la fête '%s' de priorité [%d] n'a pas de date", annee, a.getLibelle(), a.getPriorite()));
				}
				if(b.pasDeDate()) {
					System.out.println(String.format("En %d, la fête '%s' de priorité [%d] n'a pas de date", annee, b.getLibelle(), b.getPriorite()));
				}
				if(a.memeJourQue(b)) {
					System.out.println(String.format("En %d, la fête '%s' de priorité [%d] tombe le même jour que la fête '%s' de priorité [%d]", annee, a.getLibelle(), a.getPriorite(), b.getLibelle(), b.getPriorite()));
				}
			}
		}
	}
	
    static List<DateLiturgique> solennitesFetesDuSeigneurEtDeLaVierge(int annee) {
        return Arrays.asList(
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
            divineMisericorde(annee),
            troisiemeDimanchePaques(annee),
            quatriemeDimanchePaques(annee),
            cinquiemeDimanchePaques(annee),
            sixiemeDimanchePaques(annee),
            septiemeDimanchePaques(annee),
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
        ).stream()
		.filter(Objects::nonNull)
		.collect(Collectors.toList());
    }
}
