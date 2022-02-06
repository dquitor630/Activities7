package activity21;

public class PrimerContenedor{
	public int numero=0;
	static public int numero3=13;
	public PrimerContenedor(int numero){
	this.numero=numero;
	}
	public String muestraContenedor(Contenido refCont){
	return "No contenedor= "+numero+"No contenido= "+refCont.numero2;
	}
	static class Contenido{
	public int numero2;
	public Contenido(int numero2){
	this.numero2=numero2;
	}
	public String muestraContenido(){
	return "No contenedor= "+numero3+" No contenido= "+numero2;
	}
	}
}