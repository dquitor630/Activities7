package activity19;

public class Contenedor{
	public int numero=0;
	public Contenedor(int numero){
	this.numero=numero;
	}
	public String muestraContenedor(Contenido refCont){
	return "N. contenedor= "+numero+" N. contenido= "+refCont.numero2;
	}
	public class Contenido{
	public int numero2;
	public Contenido(int numero2){
	this.numero2=numero2;
	}
	public String muestraContenido(){
	return "N.contenedor= "+numero+" N.contenido= "+numero2;
	}
	}
}