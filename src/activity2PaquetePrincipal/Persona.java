package activity2PaquetePrincipal;

public class Persona {
	public String nombre;
	/*esto sería friendly*/int edad;
	protected String nacionalidad;
	private String genero;
	
	
	
	
	public Persona() {
		this("Sin datos", "Sin datos", "Sin datos", 18);
	}
	
	
	public Persona(String nombre,  String genero, String nacionalidad, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	
	@Override
	public String toString() {
		return "Persona nombre=" + nombre +", edad=" + edad + ", genero=" + genero + ", nacionalidad=" +  nacionalidad;
	}



}
