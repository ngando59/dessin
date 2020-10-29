package dessin.geometrie;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author
 * 
 *         Classe Abstraite repr�sentant un forme g�ometrique
 *
 */
public abstract class Geometrie implements Comparable<Geometrie> {

	NumberFormat formatter = new DecimalFormat("#0.00");

	/**
	 * @param forme
	 * @return true si forme est egale
	 */
	public abstract boolean equals(Geometrie forme);

	/**
	 * @return repr�sentation de la forme
	 */
	public abstract String toString();

	/**
	 * @return perimetre de la forme
	 */
	public abstract double perimetre();

	/**
	 * @return aire de la forme
	 */
	public abstract double aire();

	@SuppressWarnings("deprecation")
	public int compareTo(Geometrie o) {
		Double perimetre1 = new Double(perimetre());
		Double perimetre2 = new Double(o.perimetre());
		return (perimetre1.compareTo(perimetre2));
	}

}
