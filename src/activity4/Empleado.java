package activity4;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double sueldo;

	public Empleado() {
		this("Sin datos", "Sin datos", 18, 1000.0);
	}
	
	
	public Empleado(String nombre,  String apellido,  int edad, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public void calcularSueldo(double ganancia) {
		sueldo = sueldo + ganancia;
	}
}
