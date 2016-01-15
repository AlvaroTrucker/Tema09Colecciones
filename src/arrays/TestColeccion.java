package arrays;

public class TestColeccion {

	public static void main(String[] args) {
		Coleccion c1 = new Coleccion(4,4);
		c1.rellenarColeccion(10);
		c1.mostrarColeccion();
		System.out.printf("Valor minimo: %.2f\n", c1.minimoColeccion());
		System.out.printf("Valor maximo: %.2f\n",c1.maximoColeccion());
		System.out.printf("Valor medio: %.2f\n",c1.mediaColeccion());
		
		//usamos el segundo constructor
		double [][] vector = {{1,2,3},{4,5,6}};
		Coleccion c2 = new Coleccion(vector);
		System.out.printf("Valor medio %.2f, valor máximo %.2f y valor mínimo %.2f%n",c2.mediaColeccion(),c2.maximoColeccion(),c2.minimoColeccion());

	}
}
