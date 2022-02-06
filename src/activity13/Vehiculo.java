package activity13;

public abstract class Vehiculo {
	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}

	public abstract int getVelocidadActual();
}

//si puede tener descendencia
//podremos sobrescribir solamente el abstracto ya que el otro tiene un final