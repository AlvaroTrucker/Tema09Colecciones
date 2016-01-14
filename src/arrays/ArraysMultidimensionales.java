package arrays;

public class ArraysMultidimensionales {
	static int[][] arrayBidimensionalEnteros;
	public static void main(String[] args) {
		final int NUMERO_FILAS = 3;
		final int NUMERO_COLUMNAS = 4;
		arrayBidimensionalEnteros = new int[NUMERO_FILAS][NUMERO_COLUMNAS];
		System.out.printf("Nº filas: %d, Nº columnas: %d, Nº elementos: %d",
				arrayBidimensionalEnteros.length, 
				arrayBidimensionalEnteros[0].length, 
				arrayBidimensionalEnteros.length*arrayBidimensionalEnteros[0].length);
		rellenarArray(2, 3);
		mostrarArray();

	}
	public static void rellenarArray(int numeroInicial, int numeroMultiplicador){
		int numeroAlmacenar = numeroInicial;
		for (int i = 0; i < arrayBidimensionalEnteros.length; i++) {
			for (int j= 0; j < arrayBidimensionalEnteros[i].length; j++) {
				arrayBidimensionalEnteros[i][j] = numeroAlmacenar;
				numeroAlmacenar *= numeroMultiplicador;
			}
		}
	}
	public static void mostrarArray(){
		for (int i = 0; i < arrayBidimensionalEnteros.length; i++) {
			for (int j = 0; j < arrayBidimensionalEnteros[i].length; j++) {
				System.out.printf("%7d",arrayBidimensionalEnteros[i][j]);
			}
			System.out.println();
		}
	}
}
