package activity14;

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
	}
}
