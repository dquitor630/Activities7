package activity14;

public class Alfareria implements Mercancia{
	private double precio;
	private String descripcion;
	private boolean fragil;
	
	
	public Alfareria() {
		this(0.0, "Sin datos", false);
	}
	
	public Alfareria(double precio, String descripcion, boolean fragil) {
		setPrecio(precio);
		setDescripcion(descripcion);
		setRegada(fragil);
	}
	
	

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setRegada(boolean fragil) {
		this.fragil = fragil;
	}
	
	
	public boolean comprobarEstado(){
		return fragil;
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


