package dessin.geometrie;

/**
 * @author
 *
 *         Classe représentant un cercle : un cercle est défini par son centre
 *         et son rayon.
 */
public class Cercle extends Geometrie {

	private Point centre;
	private int rayon;

	public Cercle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	/**
	 * @return the centre
	 */
	public Point getCentre() {
		return centre;
	}

	/**
	 * @param centre the centre to set
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	/**
	 * @return the rayon
	 */
	public int getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	public String toString() {
		String str = "Cercle de centre " + centre + " et de rayon " + rayon + "m \n";
		str += ">> P : " + formatter.format(perimetre()) + "m ";
		str += "| A : " + formatter.format(aire()) + "m²\n";
		return str;
	}

	@Override
	public boolean equals(Geometrie forme) {
		return (forme instanceof Cercle) && ((Cercle) forme).getCentre().equals(this.centre)
				&& ((Cercle) forme).getRayon() == this.rayon;
	}
}
