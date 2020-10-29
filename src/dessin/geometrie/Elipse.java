package dessin.geometrie;

/**
 * @author
 * 
 *         Classe représentant une elipse : une elipse est défini par son centre
 *         et 2 longueurs le grandAxe et le petitAxe
 * 
 */
public class Elipse extends Geometrie {

	private Point centre;
	private int grandAxe;
	private int petitAxe;

	public Elipse(Point centre, int grandAxe, int petitAxe) {
		this.centre = centre;
		this.grandAxe = grandAxe;
		this.petitAxe = petitAxe;
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
	 * @return the grandAxe
	 */
	public int getGrandAxe() {
		return grandAxe;
	}

	/**
	 * @param grandAxe the grandAxe to set
	 */
	public void setGrandAxe(int grandAxe) {
		this.grandAxe = grandAxe;
	}

	/**
	 * @return the petitAxe
	 */
	public int getPetitAxe() {
		return petitAxe;
	}

	/**
	 * @param petitAxe the petitAxe to set
	 */
	public void setPetitAxe(int petitAxe) {
		this.petitAxe = petitAxe;
	}

	@Override
	public boolean equals(Geometrie forme) {
		return (forme instanceof Elipse) && ((Elipse) forme).getCentre().equals(this.getCentre())
				&& ((Elipse) forme).getGrandAxe() == this.getGrandAxe()
				&& ((Elipse) forme).getPetitAxe() == this.getPetitAxe();
	}

	@Override
	public String toString() {
		String str = "Elipse de grandAxe : " + grandAxe + "m et de petitAxe : " + petitAxe + "m\n";
		str += ">> P : " + formatter.format(perimetre()) + "m";
		str += " | A : " + formatter.format(aire()) + "m²\n";
		return str;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * Math.sqrt((grandAxe * grandAxe + petitAxe * petitAxe) / 2);
	}

	@Override
	public double aire() {
		return Math.PI * grandAxe * petitAxe;
	}

}
