package activity15;

public class Alfareria implements MercanciaFragil{
	private double precio;
	private String descripcion;
	private boolean fragil;
	private String embalaje;
	private double peso;
	
	public Alfareria() {
		this(0.0, "Sin datos", false, 0.0, "sin datos");
	}
	
	public Alfareria(double precio, String descripcion, boolean fragil, double peso, String embalaje) {
		setPrecio(precio);
		setDescripcion(descripcion);
		setRegada(fragil);
		setPeso(peso);
		setEmbalaje(embalaje);
	}
	public String dameEmbalaje() {
		return embalaje;
	}
	public double damePeso() {
		return peso;
	}
	
	public double damePrecio() {
		return precio;
	}
	
	public String dameDescripcion() {
		return descripcion;
	}
	

	public boolean comprobarEstado(){
		return fragil;
	}
	
	public void setEmbalaje(String embalaje) {
		this.embalaje = embalaje;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setRegada(boolean fragil) {
		this.fragil = fragil;
	}
	
	
	
}


