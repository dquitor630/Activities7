package activity2PaquetePrincipal;

import activity2PaquetePrincipal.Persona;

public class Profesor extends Persona {
	
	protected double sueldo;
	
	
	public Profesor() {
		this("Sin datos", 18, "Sin datos", "Sin datos", 1400.0);
	}
	
	public Profesor(String nombre, String genero,int edad, String nacionalidad, double sueldo) {
		//lo sobrecargo para tener los dos metodos, en el anterior ejercicio tenia ya el apartado dos porque el por defecto lo hice complementando con uno de this
		super(nombre, edad, genero, nacionalidad);
		this.sueldo = sueldo;
	}
	public Profesor(String nombre, int edad, String genero, String nacionalidad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Profesor nombre=" + nombre +", edad=" + edad + ", genero=" + genero + ", nacionalidad=" +  nacionalidad + ", sueldo= "  + sueldo;
	}
	
	public void pruebas() {
		Persona per1;
		per1 = new Persona();
		System.out.println(per1.nombre); // me deja acceder
		System.out.println(per1.edad); //friendly me deja
		System.out.println(per1.nacionalidad); //protected tambien
		System.out.println(per1.genero); //privado no
		
	}
}
