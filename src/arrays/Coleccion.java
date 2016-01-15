package arrays;

import java.util.Arrays;

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

	//método que rellena números en el array
	public void rellenarColeccion(int multiplicador){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				this.vector[i][j] = multiplicador*Math.random();
			}
		}
	}
	
	//método que muestra el array
	public static void mostrarColeccion(){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.printf("%7.2f",vector[i][j]);
			}
			System.out.println();
		}
	}
	
	//método para calcular el mínimo número de la colección
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
	
	//método para calcular el máximo número de la colección
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
	
	//método para calcular la media de la colección
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
	
	//metodo que convierte el array bidimensional a unidimensional
	//usamos la clase Arrays para ordenar el array unidimensional
	//hacemos cálculos estadísticos
	public void calcularValoresEstadisticos(){
		int tamano = vector.length * vector[0].length;
		double[] vectorUnidimensional = new double[tamano];
		int contador = 0;
		for (double[] ds : vector) {
			for (double d : ds) {
				vectorUnidimensional[contador] = d;
				contador++;
			}
		}
		Arrays.sort(vectorUnidimensional);
		System.out.printf("Valor mas grande: %.2f y el mas pequeño %.2f",
				vectorUnidimensional[vectorUnidimensional.length-1],vectorUnidimensional[0]);
	}
}
