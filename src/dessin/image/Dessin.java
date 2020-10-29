package dessin.image;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author
 * 
 *         classe représentant un dessin : un dessin est composé d'image
 *
 */
public class Dessin {

	NumberFormat formatter = new DecimalFormat("#0.00");

	private Set<Image> images;

	public Dessin() {
		images = new HashSet<Image>();
	}

	/**
	 * @return the images
	 */
	public Set<Image> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(Set<Image> images) {
		this.images = images;
	}

	/**
	 * Ajoute une image au dessin
	 * 
	 * @param image
	 */
	public void addImage(Image image) {
		images.add(image);
	}

	/**
	 * Affichage du dessin
	 */
	public String toString() {
		String str = "******************** Dessin ********************\n";
		for (Image img : images) {
			str += img + "\n";
		}
		str += "\n";
		str += "Total dessin : \n";
		str += ">> P : " + formatter.format(perimetre()) + "m";
		str += " | A : " + formatter.format(aire()) + "m²\n";
		str += "************************************************\n";
		return str;
	}

	/**
	 * @return perimètre du dessin
	 */
	public double perimetre() {
		double result = 0.0;
		for (Image img : images) {
			result += img.perimetre();
		}
		return result;
	}

	/**
	 * @return aire du dessin
	 */
	public double aire() {
		double result = 0.0;
		for (Image img : images) {
			result += img.aire();
		}
		return result;
	}

	/**
	 * @return une copie du dessin
	 */
	public Dessin copie() {
		Dessin copie = new Dessin();
		for (Image img : images) {
			copie.addImage(img);
		}
		return copie;
	}

	/**
	 * Tri les images selon leur aire croissant
	 */
	public void triAire() {
		TreeSet<Image> treeset = new TreeSet<>(images);
		this.setImages(treeset);
	}

	/**
	 * @param seuil
	 * @return nombre d'image ayant une aire inférieur à un seuil donné
	 */
	public int nbImageInfASeuil(double seuil) {
		int nb = 0;
		for (Image img : images) {
			if (img.aire() < seuil) {
				nb++;
			}
		}
		return nb;
	}
}
