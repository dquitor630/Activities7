package activity8;

public class Test {
	public int dato=0;
	public static int datostatico=0;
	public void metodo() {this.datostatico++;}
	public static void metodostatico(){
	//this.datostatico++; //no se puede usar this porque los metodos estaticos se hacen referencia con la clase, no con una instancia, Test.datoestatico seria lo correcto
	datostatico++;
	}
	public static void main(String [] args){
	dato++; //no es estatico tendriamos que crear un objeto de tipo test objeto.dato, seria correcto
	datostatico++;
	metodostatico();
	metodo(); //lo mismo de antes
	}
	}

