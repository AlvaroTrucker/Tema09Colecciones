package arrays;

public class TestColeccion {

	public static void main(String[] args) {
		Coleccion c1 = new Coleccion(4,4);
		c1.rellenarColeccion(10);
		c1.mostrarColeccion();
		System.out.printf("Valor minimo: %.2f", c1.minimoColeccion());
		System.out.printf("Valor maximo: %.2f",c1.maximoColeccion());
		System.out.printf("Valor medio: %.2f",c1.mediaColeccion());
		
		
	}
}
