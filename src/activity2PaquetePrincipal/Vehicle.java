package activity2PaquetePrincipal;
import activity1_2.Profesor;
import activity2PaquetePrincipal.Persona;

public class Vehicle {

	private int wheelCount;
	private double speed;
	private String colour;
	//clase en distinto paquete
	public Vehicle(int wheelCount, String colour) { //Constructor con parámetros
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public double getSpeed() {
		return speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
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