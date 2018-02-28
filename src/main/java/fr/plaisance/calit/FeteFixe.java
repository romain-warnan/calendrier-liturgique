package fr.plaisance.calit;

import java.time.MonthDay;

public class FeteFixe extends Fete {

    // static final FeteFixe Visitation = of(LocalDate.)

    private FeteFixe(MonthDay date, int annee, String libelle, Couleur couleur) {
        super(date.atYear(annee), libelle, couleur);
    }

    static DateLiturgique of(MonthDay date, int annee, String libelle, Couleur couleur) {
        return new FeteFixe(date, annee, libelle, couleur);
    }
}
