package activity11;

import java.util.Random;

public class Dado extends Sorteo {
	public int lanzar() {
		Random random = new Random();
		posibilidades = random.nextInt(6) + 1;
		return posibilidades;
	}
}
