package fr.plaisance.calit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Properties;

public class DateLiturgique {

	enum Couleur {
		VIOLET, ROSE, BLANC, VERT, ROUGE
	}

	LocalDate date;
	String libelle;
	Couleur couleur;
	Integer priorite;

	private static final Properties resourceBundle = readProperties();

	private static Properties readProperties() {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String propertiesPath = rootPath + "app.properties";
		Properties properties = new Properties();
		try {
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
}
