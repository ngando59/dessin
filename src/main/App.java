package main;

import java.util.Scanner;

import dessin.geometrie.Cercle;
import dessin.geometrie.Elipse;
import dessin.geometrie.Ligne;
import dessin.geometrie.Point;
import dessin.image.Dessin;
import dessin.image.Image;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choisir un numéro de test : ********************");
		System.out.println("0 : Sortir");
		System.out.println("1 : Test cercle");
		System.out.println("2 : Test Ligne");
		System.out.println("3 : Test Elipse");
		System.out.println("4 : Test Image");
		System.out.println("5 : Test Dessin");
		System.out.println();
		System.out.println("6 : Test copie Dessin");
		System.out.println("7 : Test tri Aire Dessin");
		System.out.println("8 : Test Seuil Aire image dessin");
		System.out.println();
		System.out.println("9 : Test Tri perimetre Image");
		System.out.println("10 : Test Seuil Forme Image");
		System.out.println("************************************************");

		int choix = -1;

		while (choix != 0) {
			System.out.print("Choix : ");
			String str = sc.next();

			Point o = new Point(0, 0);

			Point a = new Point(1, 1);
			Point b = new Point(2, 2);
			Point c = new Point(3, 3);
			Point d = new Point(4, 4);

			Cercle cercle = new Cercle(o, 3);
			Ligne ligne = new Ligne(a, b);
			Elipse elipse = new Elipse(o, 2, 1);

			try {
				choix = Integer.valueOf(str).intValue();
			} catch (Exception e) {
			}
			if (choix == 1) {
				// test Cercle
				System.out.println(cercle);

			}
			if (choix == 2) {
				// test Ligne
				System.out.println(ligne);
			}
			if (choix == 3) {
				// test Elispe
				System.out.println(elipse);
			}
			if (choix == 4) {
				// test image
				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);
				System.out.println(img);
			}
			if (choix == 5) {
				// test dessin
				Dessin dessin = new Dessin();

				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);

				Image img2 = new Image();
				img2.addForme(new Cercle(c, 1));
				img2.addForme(new Cercle(d, 2));

				dessin.addImage(img);
				dessin.addImage(img2);

				System.out.println(dessin);
			}

			if (choix == 6) {
				Dessin dessin = new Dessin();

				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);

				Image img2 = new Image();
				img2.addForme(new Cercle(c, 1));
				img2.addForme(new Cercle(d, 2));

				dessin.addImage(img);
				dessin.addImage(img2);

				System.out.println(dessin);

				System.out.println("---------------------- copie ----------------------");
				Dessin copie = dessin.copie();
				System.out.println(copie);
			}

			if (choix == 7) {
				Dessin dessin = new Dessin();

				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);

				Image img2 = new Image();
				img2.addForme(new Cercle(c, 1));
				img2.addForme(new Cercle(d, 2));

				dessin.addImage(img2);
				dessin.addImage(img);

				System.out.println(dessin);

				System.out.println("---------------------- Après tri Aire ----------------------");
				dessin.triAire();
				System.out.println(dessin);

			}
			if (choix == 8) {
				Dessin dessin = new Dessin();

				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);

				Image img2 = new Image();
				img2.addForme(new Cercle(c, 1));
				img2.addForme(new Cercle(d, 2));

				dessin.addImage(img2);
				dessin.addImage(img);

				System.out.println(dessin);

				System.out.print(">> Choisir Seuil : ");
				String choixSeuil = sc.next();
				double seuil = 0.0;
				try {
					seuil = Double.valueOf(choixSeuil).intValue();
				} catch (Exception e) {
				}
				System.out.println(dessin.nbImageInfASeuil(seuil) + " image(s) a(ont) une aire inférieur à " + seuil);
			}

			if (choix == 9) {
				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);
				System.out.println(img);

				System.out.println("---------------------- Après tri Périmètre ----------------------");
				img.triPerimetre();
				System.out.println(img);
			}

			if (choix == 10) {
				Image img = new Image();
				img.addForme(cercle);
				img.addForme(elipse);
				System.out.println(img);

				System.out.print(">> Choisir Seuil : ");
				String choixSeuil = sc.next();
				double seuil = 0.0;
				try {
					seuil = Double.valueOf(choixSeuil).intValue();
				} catch (Exception e) {
				}
				System.out.println(img.nbFormeInfASeuil(seuil) + " forme(s) a(ont) un périmètre inférieur à " + seuil);
			}
		}

	}

}
