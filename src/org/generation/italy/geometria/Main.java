package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base;
		int altezza;
		Scanner cIn = new Scanner(System.in);
		System.out.println("Inserire la base ");
		base = cIn.nextInt();
		System.out.println("inserire l'altezza ");
		altezza = cIn.nextInt();

		Rettangolo r = new Rettangolo(base, altezza);
		System.out.println("la base �: " + r.base);
		System.out.println("l'altezza �: " + r.altezza);
		System.out.println("il perimetro �: " + r.perimetro());
		System.out.println("l'area �: " + r.area());
		cIn.close();
	}

}
