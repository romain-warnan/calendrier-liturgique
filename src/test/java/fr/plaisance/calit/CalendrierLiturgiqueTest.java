package fr.plaisance.calit;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class CalendrierLiturgiqueTest {

    @Test
    public void devraitRetournerLaDateDePaque2019() {
        int annee = 2019;
		LocalDate datePaques = CalendrierLiturgique.paques(annee);
        assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
    }
    
    @Test
    public void devraitRetournerLaDateDePaque2030() {
    	int annee = 2030;
		LocalDate datePaques = CalendrierLiturgique.paques(annee);
    	assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
    }
    
    @Test
    public void devraitRetournerLaDateDePaque2100() {
    	int annee = 2100;
		LocalDate datePaques = CalendrierLiturgique.paques(annee);
    	assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.MARCH, 28));
    }
    
    @Test
    public void devraitRetournerLaDateDePaque2001() {
    	int annee = 2001;
		LocalDate datePaques = CalendrierLiturgique.paques(annee);
    	assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.APRIL, 15));
    }
    
    @Test
    public void devraitRetournerLaDateDePaque2055() {
    	int annee = 2055;
    	LocalDate datePaques = CalendrierLiturgique.paques(annee);
    	assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.APRIL, 18));
    }
    
    @Test
    public void devraitRetournerLaDateDePaque2076() {
    	int annee = 2076;
    	LocalDate datePaques = CalendrierLiturgique.paques(annee);
    	assertThat(datePaques).isEqualTo(LocalDate.of(annee, Month.APRIL, 19));
    }
}
