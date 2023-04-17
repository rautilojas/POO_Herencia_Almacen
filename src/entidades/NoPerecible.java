package entidades;

public class NoPerecible extends Producto{
	
	private int contenido;
	private int calorias;
	
	public int getContenido() {
		return contenido;
	}
	public int getCalorias() {
		return calorias;
	}
	
	public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
		super(nombre, precio);
		this.contenido = contenido;
		this.calorias = calorias;
	}
}