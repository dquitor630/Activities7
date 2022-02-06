package activity17;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		Pez sardina = new Pez("sardina", "Sardina del mediterraneo", "mediterraneo");
		System.out.println(sardina.toString());
		PezAguaDulce carpa = new PezAguaDulce("Carpa", "Carpa japonesa", "Tokyo", false);
		System.out.println(carpa.toString());
		System.out.println("Número de peces: " + Pez.getCantidadPeces());
	}

}
