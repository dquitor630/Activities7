package activity15;

public class Jardineria implements MercanciaViva {
	private double precio;
	private String descripcion;
	private boolean regada;
	private boolean nutrida;
	

	public Jardineria() {
		this(0.0, "Sin datos", false, false);
	}
	
	public Jardineria(double precio, String descripcion, boolean regada, boolean nutrida) {
		setPrecio(precio);
		setDescripcion(descripcion);
		setRegada(regada);
		setNutrida(nutrida);
	}
	
	
	public boolean comprobarEstado(){
		return regada;
	}
	
	
	public String dameDescripcion() {
		return descripcion;
	}
	
	public double damePrecio() {
		return precio;
	}
	
	
	public boolean necesitaComida() {
		if (nutrida) {
			return false;
		}else {
			return true;
		}
	}
	public boolean necesitaRiego() {
		if (regada) {
			return false;
		}else {
			return true;
		}
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setRegada(boolean regada) {
		this.regada = regada;
	}
	
	public void setNutrida(boolean nutrida) {
		this.nutrida = nutrida;
	}
	
	
	
}
