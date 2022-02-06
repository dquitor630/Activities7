package activity19;

public class VerClaseInterna{
	public static void main(String args[]){
	Contenedor c1 = new Contenedor(34);
	Contenedor.Contenido i1 = c1.new Contenido(23);
	System.out.println(c1.muestraContenedor(i1));
	c1.numero=50;
	System.out.println(i1.muestraContenido());
	i1.numero2=25;
	System.out.println(c1.muestraContenedor(i1));
	i1.numero2=65;
	System.out.println(i1.muestraContenido());
	}
}

//claramente es una clase interna miembro