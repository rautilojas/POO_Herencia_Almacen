package entidades;

public class Limpieza extends Producto{
	
	private String componentes;
	private Double litros;
	
	public String getComponentes() {
		return componentes;
	}
	public Double getLitros() {
		return litros;
	}
	
	public Limpieza(String nombre, Double precio, String componentes, Double litros) {
		super(nombre, precio);
		this.componentes = componentes;
		this.litros = litros;
	}	
}