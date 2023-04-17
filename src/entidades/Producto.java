package entidades;

public class Producto {
	
	protected String nombre;
	protected Double precio;
	
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	
	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
}