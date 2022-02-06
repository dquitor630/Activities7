package activity67;

public class TestForma {
	public static void main(String[] args) {
		Forma f=new Circulo();
		f.identidad();
		Circulo c=new Circulo();
		((Forma)c).identidad();
		((Circulo)f).identidad();
//		Forma f2=new Forma(); no podemos iniciar una clase abstracta
//		f2.identidad();
		//(Forma)f.identidad(); no se puede hacer eso con una clase abstracta, al hacer un casting de forma al círculo, usamos la clase abstractca
		f=c;
		c=(Circulo) f; //he añadido un casting con esto se soluciona
		//a todas las identidades hay que añadirles un sysout
	}
}
