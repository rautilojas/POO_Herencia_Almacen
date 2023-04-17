package utilidades;
import entidades.Fruta;
import entidades.Lacteo;
import entidades.Limpieza;
import entidades.NoPerecible;
import entidades.Producto;

public class MainProducto {
	
	public static void main(String[] args) {
		        Producto[] productos = new Producto[8];

		        Fruta manzana = new Fruta("Manzana", 80.0, 1.5, "Rojo");
		        Fruta banana = new Fruta("Banana", 60.50, 2.5, "Amarillo");
		        Limpieza detergente = new Limpieza("Detergente", 150.00, "Sulfato de sodio", 1.5);
		        Limpieza jabon = new Limpieza("Gel desinfectante", 80.00, "Glicerina", 0.5);
		        Lacteo leche = new Lacteo("Leche", 250.00, 1, 17);
		        Lacteo yogurt = new Lacteo("Yogurt", 200.00, 1, 50);
		        NoPerecible arroz = new NoPerecible("Arroz", 130.00, 100, 1300);
		        NoPerecible lentejas = new NoPerecible("Lentejas", 90.00, 200, 1100);

		        productos[0] = manzana;
		        productos[1] = banana;
		        productos[2] = detergente;
		        productos[3] = jabon;
		        productos[4] = leche;
		        productos[5] = yogurt;
		        productos[6] = arroz;
		        productos[7] = lentejas;

		        for (Producto p : productos) {
		            System.out.println("Nombre: " + p.getNombre());
		            System.out.println("Precio: " + p.getPrecio());

		            if (p instanceof Fruta) {
		                Fruta f = (Fruta) p;
		                System.out.println("Peso: " + f.getPeso());
		                System.out.println("Color: " + f.getColor());
		            } else if (p instanceof Limpieza) {
		                Limpieza l = (Limpieza) p;
		                System.out.println("Componentes: " + l.getComponentes());
		                System.out.println("Litros: " + l.getLitros());
		            } else if (p instanceof Lacteo) {
		                Lacteo l = (Lacteo) p;
		                System.out.println("Cantidad: " + l.getCantidad());
		                System.out.println("Proteínas: " + l.getProteinas());
		            } else if (p instanceof NoPerecible) {
		                NoPerecible np = (NoPerecible) p;
		                System.out.println("Contenido: " + np.getContenido());
		                System.out.println("Calorías: " + np.getCalorias());
		            }

		            System.out.println();
		        }
        
	}
}