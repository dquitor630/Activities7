package activity14;

public class Jardineria implements Mercancia {
	private double precio;
	private String descripcion;
	private boolean regada;
	
	
	public Jardineria() {
		this(0.0, "Sin datos", false);
	}
	
	public Jardineria(double precio, String descripcion, boolean regada) {
		setPrecio(precio);
		setDescripcion(descripcion);
		setRegada(regada);
	}
	
	

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setRegada(boolean regada) {
		this.regada = regada;
	}
	
	
	public boolean comprobarEstado(){
		return regada;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double damePrecio() {
		return precio;
	}
	
	public String dameDescripcion() {
		return descripcion;
	}
	
	
}
