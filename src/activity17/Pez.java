package activity17;

public class Pez {
	private String nombre;
	private String especie;
	private String zona;
	public static int numPeces;

	public Pez() {
		this("sin datos", "Sin datos", "Sin datos");
	}

	public Pez(String nombre, String especie, String zona) {
		setNombre(nombre);
		setEspecie(especie);
		setZona(zona);
		numPeces = numPeces + 1;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public static int getCantidadPeces() {
		return numPeces;
	}

	@Override
	public String toString() {
		return "Pez, nombre: " + nombre + ", especie: " + especie + ", zona=: " + zona;
	}
}
