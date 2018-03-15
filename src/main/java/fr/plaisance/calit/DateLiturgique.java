package fr.plaisance.calit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Arrays;
import java.util.Properties;

public class DateLiturgique {

	enum Couleur {
		VIOLET, ROSE, BLANC, VERT, ROUGE
	}

	private LocalDate date;
	private String libelle;
	private Couleur couleur;
	private Integer priorite;

	private static final Properties resourceBundle = readProperties();

	private static Properties readProperties() {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		Properties properties = new Properties();
		try {
			String propertiesPath = URLDecoder.decode(rootPath + "app.properties", StandardCharsets.UTF_8.name());
			properties.load(new InputStreamReader(new FileInputStream(propertiesPath), StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	private DateLiturgique(LocalDate date, String libelle, Couleur couleur, Integer priorite) {
		this.date = date;
		this.libelle = libelle;
		this.couleur = couleur;
		this.priorite = priorite;
	}

	static DateLiturgique of(LocalDate date, String etiquette, Couleur couleur, Integer priorite) {
		return new DateLiturgique(date, resourceBundle.getProperty(etiquette), couleur, priorite);
	}

	static DateLiturgique fixe(MonthDay date, int annee, String etiquette, Couleur couleur, Integer priorite) {
		return new DateLiturgique(date.atYear(annee), resourceBundle.getProperty(etiquette), couleur, priorite);
	}
	
	boolean memeJourQue(DateLiturgique... dates) {
		return Arrays.stream(dates).anyMatch(d -> this.date.isEqual(d.date));
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Integer getPriorite() {
		return priorite;
	}

	public void setPriorite(Integer priorite) {
		this.priorite = priorite;
	}
}
