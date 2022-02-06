package activity5;

class Prueba{
	protected String nombre;
	protected int id;
	public String getIdent() {return nombre;}
	//hay que sobrecargar el metodo para que funcione
	public int getIdent(double a) {return id;}
}