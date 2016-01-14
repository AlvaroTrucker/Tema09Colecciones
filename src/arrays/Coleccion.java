package arrays;

public class Coleccion {
	//atributos
	private static double[][] vector;
	
	//constructores
	public Coleccion(int filas, int columnas){
		this.vector = new double[filas][columnas];
	}
	
	public Coleccion(double[][] vector) {
		this.vector = vector;
	}

	public void rellenarColeccion(int multiplicador){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				this.vector[i][j] = multiplicador*Math.random();
			}
		}
	}
	
	public static void mostrarColeccion(){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.printf("%7.2f",vector[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void minimoColeccion(){
		
	}
	
	public static void maximoColeccion(){
		
	}
	
	public static void mediaColeccion(){
		
	}
}
