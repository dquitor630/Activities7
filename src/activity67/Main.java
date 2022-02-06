package activity67;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {

		Forma formas[] = new Forma[4];
		formas[0] = new Circulo();
		formas[1] = new Cuadrado();
		formas[2] = new Triangulo();
		formas[3] = new Rombo();
		
		
		for (int i = 0; i < formas.length; i++) {
			System.out.println(formas[i].identidad());
			System.out.println(formas[i].identidad(i));
			System.out.println(formas[i].identidad("a"));
		
		}

	}
}