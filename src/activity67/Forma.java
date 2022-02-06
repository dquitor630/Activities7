package activity67;

public abstract class Forma {

	@Override
	public abstract String toString();
	
	public String identidad() {
		Class<? extends Forma> tipo = this.getClass();
		return String.valueOf(tipo);
	}
	
	public String identidad(int i) {
		if (this instanceof Triangulo) {
			return "Triangulo";
		}else if(this instanceof Circulo) {
			return "Circulo";
		}else if(this instanceof Rombo) {
			return "Rombo";
		}else {
			return "Cuadrado";
		}
	}
	
	public String identidad(String i) {
	return this.toString();
	}
	
}
