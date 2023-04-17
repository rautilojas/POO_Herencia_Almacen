package entidades;

public class Lacteo extends Producto{
	
	private int cantidad;
	private int proteinas;
	
	public int getCantidad() {
		return cantidad;
	}
	public int getProteinas() {
		return proteinas;
	}
	
	public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
		super(nombre, precio);
		this.cantidad = cantidad;
		this.proteinas = proteinas;
	}
}