package activity1_1;

public class Profesor extends Persona {
	
	protected double sueldo;
	
	
	public Profesor() {
		this("Sin datos", 18, "Sin datos", "Sin datos", 1400.0);
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
	
	
}
