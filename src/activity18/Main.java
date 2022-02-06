package activity18;



public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
	Huevo huevo = new Huevo();
	Huevo.Clara clara = huevo.new Clara();
	Huevo.Yema yema = huevo.new Yema();
	clara.batir();
	yema.batir();

	}
}