package activity1_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		boolean persona = false;
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(keyboard);
		Profesor prof1;
		prof1 = new Profesor();
		Alumno alu1;
		alu1 = new Alumno();
		Persona per1;
		per1 = new Persona();
		System.out.println(prof1.toString());
		System.out.println(alu1.toString());
		System.out.println("¿Quien quieres hacer una persona?  ¿Alumno o profesor? (1 alumno, 2 profesor)");
		persona = console.readBooleanUsingInt(1, 2);
		if (persona) {
			per1 = alu1;
		}else {
			per1 = prof1;
		}
		
		System.out.println(per1.toString());
		

	}
}
