package fr.plaisance.calit;

import java.time.LocalDate;
import java.time.Month;

public class OutilsDate {

    static boolean durantTriduumPascal(LocalDate date) {
        LocalDate paques = datePaques(date.getYear());
        return largementEntre(date, paques.minusDays(2), paques);
    }

    static boolean durantOctaveDePaques(LocalDate date) {
        LocalDate paques = datePaques(date.getYear());
        return largementEntre(date, paques, paques.plusWeeks(1));
    }

    static boolean durantSemaineSainte(LocalDate date) {
        LocalDate paques = datePaques(date.getYear());
        return largementEntre(date, paques.minusWeeks(1), paques);
    }

    static boolean durantTempsPascal(LocalDate date) {
        LocalDate paques = datePaques(date.getYear());
        return largementEntre(date, paques, paques.plusWeeks(6));
    }

    static LocalDate datePaques(int annee) {
        int joursDeMars = OutilsDate.algorithmeDeGauss(annee);
        return LocalDate.of(annee, Month.MARCH, 1).plusDays(joursDeMars - 1);
    }

    private static boolean largementEntre(LocalDate date, LocalDate start, LocalDate end) {
        return !start.isAfter(date) && !end.isBefore(date);
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
