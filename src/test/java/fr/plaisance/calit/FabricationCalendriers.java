package fr.plaisance.calit;

import java.io.IOException;
import java.util.List;

import static fr.plaisance.calit.CalendrierFabrique.creerCalendrier;
import static fr.plaisance.calit.Calendriers.solennitesFetesDuSeigneurEtDeLaVierge;

public class FabricationCalendriers {

    public static void main(String[] args) throws IOException {
        int annee = 2018;
        final List<DateLiturgique> dates = solennitesFetesDuSeigneurEtDeLaVierge(annee);
        creerCalendrier(String.format("docs/solennites-%d.ics", annee), dates);
    }
}
