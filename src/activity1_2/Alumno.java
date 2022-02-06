package activity1_2;

public class Alumno extends Persona {

	private boolean repetidor;
	
	public Alumno() {
		this("Sin datos", 18, "Sin datos", "Sin datos", false);
	}
	
	public Alumno(String nombre, String genero,int edad, String nacionalidad, boolean repetidor) {
		//lo sobrecargo para tener los dos metodos, en el anterior ejercicio tenia ya el apartado dos porque el por defecto lo hice complementando con uno de this
		super(nombre, edad, genero, nacionalidad);
		this.repetidor = repetidor;
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
