package activity1_1;

public class Alumno extends Persona {

	private boolean repetidor;
	
	public Alumno() {
		this("Sin datos", 18, "Sin datos", "Sin datos", false);
	}
	
	
	public Alumno(String nombre, int edad, String genero, String nacionalidad, boolean repetidor) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.repetidor = repetidor;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Alumno nombre=" + nombre +", edad=" + edad + ", genero=" + genero + ", nacionalidad=" +  nacionalidad + ", repetidor= "  + repetidor;
	}
	
}
