package fr.plaisance.calit;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class CalendrierLiturgiqueTest {

	@Test
	public void devraitRetournerLaDateDePaque2019() {
		int annee = 2019;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
	}

	@Test
	public void devraitRetournerLaDateDePaque2030() {
		int annee = 2030;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
	}

	@Test
	public void devraitRetournerLaDateDePaque2100() {
		int annee = 2100;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 28));
	}

	@Test
	public void devraitRetournerLaDateDePaque2001() {
		int annee = 2001;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 15));
	}

	@Test
	public void devraitRetournerLaDateDePaque2055() {
		int annee = 2055;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 18));
	}

	@Test
	public void devraitRetournerLaDateDePaque2076() {
		int annee = 2076;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 19));
	}

	@Test
	public void devraitRetournerLaDateDuMercrediDesCendres2018() {
		int annee = 2018;
		DateLiturgique mercrediDesCendres = CalendrierLiturgique.mercrediDesCendres(annee);
		assertThat(mercrediDesCendres.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 14));
	}

	@Test
	public void devraitRetournerInvocabit() {
		int annee = 2018;
		DateLiturgique invocabit = CalendrierLiturgique.premierDimancheDeCareme(annee);
		assertThat(invocabit.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 18));
		assertThat(invocabit.libelle).containsIgnoringCase("invocabit");
	}

	@Test
	public void devraitRetournerReminiscere() {
		int annee = 2018;
		DateLiturgique invocabit = CalendrierLiturgique.deuxiemeDimancheDeCareme(annee);
		assertThat(invocabit.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 25));
		assertThat(invocabit.libelle).containsIgnoringCase("reminiscere");
	}

	@Test
	public void devraitRetournerOculi() {
		int annee = 2018;
		DateLiturgique invocabit = CalendrierLiturgique.troisiemeDimancheDeCareme(annee);
		assertThat(invocabit.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 4));
		assertThat(invocabit.libelle).containsIgnoringCase("oculi");
	}

	@Test
	public void devraitRetournerLaetare() {
		int annee = 2018;
		DateLiturgique invocabit = CalendrierLiturgique.quatriemeDimancheDeCareme(annee);
		assertThat(invocabit.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 11));
		assertThat(invocabit.libelle).containsIgnoringCase("lætare");
	}

	@Test
	public void devraitRetournerJudica() {
		int annee = 2018;
		DateLiturgique invocabit = CalendrierLiturgique.cinquiemeDimancheDeCareme(annee);
		assertThat(invocabit.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 18));
		assertThat(invocabit.libelle).containsIgnoringCase("judica");
	}
}
