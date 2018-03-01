package fr.plaisance.calit;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendrierLiturgiqueTest {

	@Test
	public void paques2019() {
		int annee = 2019;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
	}

	@Test
	public void paques2030() {
		int annee = 2030;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 21));
	}

	@Test
	public void paques2100() {
		int annee = 2100;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 28));
	}

	@Test
	public void paques2001() {
		int annee = 2001;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 15));
	}

	@Test
	public void paques2055() {
		int annee = 2055;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 18));
	}

	@Test
	public void paques2076() {
		int annee = 2076;
		DateLiturgique paques = CalendrierLiturgique.paques(annee);
		assertThat(paques.date).isEqualTo(LocalDate.of(annee, Month.APRIL, 19));
	}

	@Test
	public void mercrediDesCendres() {
		int annee = 2018;
		DateLiturgique mercrediDesCendres = CalendrierLiturgique.cendres(annee);
		assertThat(mercrediDesCendres.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 14));
	}

	@Test
	public void invocabit() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.premierDimancheDeCareme(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 18));
		assertThat(date.libelle).containsIgnoringCase("invocabit");
	}

	@Test
	public void reminiscere() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.deuxiemeDimancheDeCareme(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.FEBRUARY, 25));
		assertThat(date.libelle).containsIgnoringCase("reminiscere");
	}

	@Test
	public void oculi() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.troisiemeDimancheDeCareme(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 4));
		assertThat(date.libelle).containsIgnoringCase("oculi");
	}

	@Test
	public void laetare() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.quatriemeDimancheDeCareme(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 11));
		assertThat(date.libelle).containsIgnoringCase("lætare");
	}

	@Test
	public void judica() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.cinquiemeDimancheDeCareme(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 18));
		assertThat(date.libelle).containsIgnoringCase("judica");
	}
	
	@Test
	public void dimancheDesRameaux() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.rameaux(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 25));
	}
	
	@Test
	public void jeudiSaint() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.jeudiSaint(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 29));
	}
	
	@Test
	public void vendrediSaint() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.vendrediSaint(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 30));
	}
	
	@Test
	public void samediSaint() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.samediSaint(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MARCH, 31));
	}
	
	@Test
	public void ascension() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.ascension(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MAY, 10));
	}
	
	@Test
	public void pentecote() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.pentecote(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MAY, 20));
	}
	
	@Test
	public void dimancheDeLaSainteTrinite() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.sainteTrinite(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.MAY, 27));
	}
	
	@Test
	public void feteDieu() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.feteDieu(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.JUNE, 3));
	}

	@Test
	public void sacreCoeur() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.sacreCoeur(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.JUNE, 8));
	}

	@Test
	public void christRoi() {
		int annee = 2018;
		DateLiturgique date = CalendrierLiturgique.christRoi(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.OCTOBER, 28));
	}

	@Test
	public void christRoiUnivers() {
		int annee = 2017;
		DateLiturgique date = CalendrierLiturgique.christRoiUnivers(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.NOVEMBER, 26));
	}
	
	@Test
	public void levavi() {
		int annee = 2017;
		DateLiturgique date = CalendrierLiturgique.premierDimancheAvent(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.DECEMBER, 3));
	}
	
	@Test
	public void populusSion() {
		int annee = 2017;
		DateLiturgique date = CalendrierLiturgique.deuxiemeDimancheAvent(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.DECEMBER, 10));
	}
	
	@Test
	public void gaudete() {
		int annee = 2017;
		DateLiturgique date = CalendrierLiturgique.troisiemeDimancheAvent(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.DECEMBER, 17));
	}
	
	@Test
	public void rorate() {
		int annee = 2017;
		DateLiturgique date = CalendrierLiturgique.quatriemeDimancheAvent(annee);
		assertThat(date.date).isEqualTo(LocalDate.of(annee, Month.DECEMBER, 24));
	}
}
