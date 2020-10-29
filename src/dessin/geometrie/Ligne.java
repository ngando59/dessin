package dessin.geometrie;

/**
 * @author
 * 
 *         Classe représentant une ligne : une ligne est défini par 2 points (a
 *         et b)
 *
 */
public class Ligne extends Geometrie {

	private Point a;
	private Point b;

	public Ligne(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Point a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Point getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public boolean equals(Geometrie forme) {
		return (forme instanceof Ligne) && ((Ligne) forme).getA().equals(this.getA())
				&& ((Ligne) forme).getB() == this.getB();
	}

	@Override
	public String toString() {
		return "Ligne de " + this.a + " à " + this.b + "\n";
	}

	@Override
	public double perimetre() {
		return 0;
	}

	@Override
	public double aire() {
		return 0;
	}

}
