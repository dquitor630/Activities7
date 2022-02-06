package activity17;

public class PezAguaDulce extends Pez {
	private boolean acuario;

	public PezAguaDulce() {
		super();
		acuario = false;
	}

	public PezAguaDulce(String nombre, String especie, String zona, boolean acuario) {
		super(nombre, especie, zona);
		this.acuario = acuario;
	}

	public void setAcuario(boolean acuario) {
		this.acuario = acuario;
	}

	@Override
	public String toString() {
		return super.toString() + ", aquario: " + acuario;
	}
}
