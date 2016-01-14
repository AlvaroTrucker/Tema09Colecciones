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
	
	public double minimoColeccion(){
		double minimo = vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i][j] < minimo)
					minimo = vector[i][j];
			}
		}
		return minimo;
	}
	
	public double maximoColeccion(){
		double maximo = vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i][j] > maximo)
					maximo = vector[i][j];
			}
		}
		return maximo;
	}
	
	
	public double mediaColeccion(){
		double media = 0;
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				suma += vector[i][j];
			}
		}
		media = suma / (vector.length * vector[0].length);
		return media;
	}
}
