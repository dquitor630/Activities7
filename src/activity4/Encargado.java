package activity4;

public class Encargado extends Empleado {

	public Encargado() {
		this("Sin datos", "Sin datos", 18, 1500.0);
	}
	
	
	public Encargado(String nombre,  String apellido,  int edad, double sueldo) {
		super(nombre, apellido, edad, sueldo);
	}
	
	@Override
	public void calcularSueldo(double ganancia) {
		ganancia = ganancia + (ganancia / 100) * 10;
		sueldo = sueldo + ganancia;
	}
	
}
