package activity11;

import java.util.Random;

public class Moneda extends Sorteo {

	public int lanzar() {
		Random random = new Random();
		return random.nextInt(2) + 1;
	}

	public String lanzar(int x) {
		if (x == 1) {
			return "cara";
		} else {
			return "cruz";
		}
	}

}
