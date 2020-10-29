package dessin.geometrie;

/**
 * @author
 * 
 *         Classe représentant un point un point est défini par son abscisse x
 *         et son ordonnée y.
 * 
 */
public class Point {

	private int x;

	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return x (abscisse)
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return y (ordonnée)
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return ("(" + x + "," + y + ")");
	}

	public boolean equals(Point p) {
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
}
