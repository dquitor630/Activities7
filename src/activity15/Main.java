package activity15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		Jardineria jardineria = new Jardineria();
		dameDatos(jardineria);
	}
	
	
	
	public static void dameDatos(Mercancia producto) {
		System.out.println("el precio del producto es: " + producto.damePrecio() + "la descripcion del producto es: " + producto.dameDescripcion());
		if(producto instanceof Jardineria) {
			System.out.println(((Jardineria) producto).necesitaComida());
			System.out.println(((Jardineria) producto).necesitaRiego());
		}else {
			System.out.println(((Alfareria) producto).dameEmbalaje());
			System.out.println(((Alfareria) producto).damePeso());
		}
	}
}
