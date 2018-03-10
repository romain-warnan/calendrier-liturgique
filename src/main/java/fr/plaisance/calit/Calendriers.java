package fr.plaisance.calit;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static fr.plaisance.calit.CalendrierFabrique.*;
import static fr.plaisance.calit.CalendrierLiturgique.*;

public class Calendriers {

    public static void main(String[] args) throws IOException {
        int annee = 2018;
        final List<DateLiturgique> dates = solennitesFetesDuSeigneurEtDeLaVierge(annee);
        creerCalendrier(String.format("docs/solennites-%d.ics", annee), dates);
    }

    private static List<DateLiturgique> solennitesFetesDuSeigneurEtDeLaVierge(int annee) {
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
    }
}
