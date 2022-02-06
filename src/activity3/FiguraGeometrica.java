package activity3;


public abstract class FiguraGeometrica {
	protected double coordX;
	protected double coordY;
	
	
	public FiguraGeometrica() {
		this(0.0, 0.0);
	}
	
	public FiguraGeometrica(double x, double y) {
		this.coordX = x;
		this.coordY = y;
	}
	
	
	
	public double getCoordX() {
		return coordX;
	}
	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}
	public double getCoordY() {
		return coordY;
	}
	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	
	public abstract void calcular_area(double x, double y);
	
	
}