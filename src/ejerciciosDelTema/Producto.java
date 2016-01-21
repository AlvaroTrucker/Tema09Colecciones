package ejerciciosDelTema;

public class Producto {
	//atributos
	private int id;
	private String nombreProducto;
	private double precioProducto;
	
	//constructores
	public Producto(int id, String nombreProducto, double precioProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	
	//getters
	public int getId() {
		return id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	//toString
	@Override
	public String toString() {
		return "Producto con id "+id+", de nombre "+nombreProducto+" y de precio "+precioProducto+"€";
	}
	
	//comprobación de la clase
	/*public static void main(String[] args) {
		Producto p = new Producto(2, "gel", 2.2);
		System.out.println(p);
	}*/
}
