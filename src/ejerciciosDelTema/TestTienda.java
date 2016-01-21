package ejerciciosDelTema;

public class TestTienda {

	public static void main(String[] args) {
		//creamos objeto tienda
		Tienda t = new Tienda();
		
		//creamos desde código objetos producto
		Producto producto1 = new Producto(0,"gel",1.33);
		Producto producto2 = new Producto(1,"champú",2.33);
		Producto producto3 = new Producto(2,"crema",12.33);		
		Producto producto4 = new Producto(3,"jabón",4.33);
		
		//los añadimos a la tienda
		t.addProducto(producto1);
		t.addProducto(producto2);
		t.addProducto(producto3);
		t.addProducto(producto4);

		System.out.println(t.listarProductos());
		System.out.println("Producto mas caro: "+t.obtenerProductoMasCaro().getNombreProducto());
		System.out.println("Producto mas barato: "+t.obtenerProductoMasBarato().getNombreProducto());

		//eliminar productos
		t.eliminarProducto(producto4);
		System.out.println(t.listarProductos());
	}
}
