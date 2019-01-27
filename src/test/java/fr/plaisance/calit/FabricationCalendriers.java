package fr.plaisance.calit;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

import static fr.plaisance.calit.CalendrierFabrique.creerCalendrier;
import static java.util.stream.Collectors.toList;

public class FabricationCalendriers {

    public static void main(String[] args) throws IOException {
        final List<DateLiturgique> dates = IntStream.range(1900, 2100)
            .mapToObj(Calendriers::solennitesFetesDuSeigneurEtDeLaVierge)
            .flatMap(Collection::stream)
            .collect(toList());
        creerCalendrier("docs/calendrier-liturgique-catholique-romain.ics", dates);
    }
}
