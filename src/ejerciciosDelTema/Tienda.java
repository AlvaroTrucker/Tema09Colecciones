package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> listaProductos;

	//creo la lista vacía
	public Tienda() {
		this.listaProductos = new ArrayList<Producto>();
	}
	
	//metodo que añade productos
	public void addProducto(Producto p){
		this.listaProductos.add(p);
	}

	//getters
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	
	//metodo que elimina productos
	public void eliminarProducto(Producto p){
		this.listaProductos.remove(p);
	}
	
	//metodo que devuelve el producto mas caro
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro = listaProductos.get(0);
		//recorremos la coleccion, comparamos los precios (getPrecio()) y actualizamos si es
		//necesario la variable productoMasCaro
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() > productoMasCaro.getPrecioProducto())
				productoMasCaro = producto;
		}
		return productoMasCaro;
	}
	
	//metodo que devuelve el producto mas barato
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato = listaProductos.get(0);
		//recorremos la coleccion, comparamos los precios (getPrecio()) y actualizamos si es
		//necesario la variable productoMasBarato
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() < productoMasBarato.getPrecioProducto())
				productoMasBarato = producto;
		}
		return productoMasBarato;
	}
	
	//metodo para listar productos
	public String listarProductos(){
		return listaProductos.toString();
	}
}