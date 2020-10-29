package dessin.image;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import dessin.geometrie.Geometrie;

/**
 * @author
 * 
 *         classe représentant une image : une image est composée de formes
 *         géométriques
 *
 */
public class Image implements Comparable<Image> {

	NumberFormat formatter = new DecimalFormat("#0.00");

	private Set<Geometrie> formes;

	public Image() {
		formes = new HashSet<Geometrie>();
	}

	/**
	 * @return the formes
	 */
	public Set<Geometrie> getFormes() {
		return formes;
	}

	/**
	 * @param formes the formes to set
	 */
	public void setFormes(Set<Geometrie> formes) {
		this.formes = formes;
	}

	/**
	 * Ajoute une forme à l'image
	 * 
	 * @param forme
	 */
	public void addForme(Geometrie forme) {
		formes.add(forme);
	}

	/**
	 * Affichage de l'image
	 */
	public String toString() {
		String str = "--------------------- Image ---------------------\n";
		for (Geometrie forme : formes) {
			str += forme + "\n";
		}
		str += "\n";
		str += "Total image : \n";
		str += ">> P : " + formatter.format(perimetre()) + "m";
		str += " | A : " + formatter.format(aire()) + "m²\n";
		str += "-------------------------------------------------\n";
		return str;
	}

	/**
	 * @return perimètre de l'image
	 */
	public double perimetre() {
		double result = 0.0;
		for (Geometrie forme : formes) {
			result += forme.perimetre();
		}
		return result;
	}

	/**
	 * @return aire de l'image
	 */
	public double aire() {
		double result = 0.0;
		for (Geometrie forme : formes) {
			result += forme.aire();
		}
		return result;
	}

	/**
	 * Tri les formes selon leur périmètre croissant
	 */
	public void triPerimetre() {
		TreeSet<Geometrie> treeset = new TreeSet<>(formes);
		this.setFormes(treeset);
	}

	/**
	 * @param seuil
	 * @return nombre de formes ayant un périmètre inférieur à un seuil donné
	 */
	public int nbFormeInfASeuil(double seuil) {
		int nb = 0;
		for (Geometrie forme : formes) {
			if (forme.perimetre() < seuil) {
				nb++;
			}
		}
		return nb;
	}

	@Override
	@SuppressWarnings("deprecation")
	public int compareTo(Image o) {
		Double aire1 = new Double(aire());
		Double aire2 = new Double(o.aire());
		return (aire1.compareTo(aire2));
	}

}
