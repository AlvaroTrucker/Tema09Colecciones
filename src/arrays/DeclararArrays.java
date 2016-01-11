package arrays;

public class DeclararArrays {

	public static void main(String[] args) {
		//Declarar primer array (de enteros)
		//Creamos la referencia
		int[] referenciaEnteros;
		
		//Creamos el array
		referenciaEnteros = new int[3];
		
		//Inicializamos los datos
		referenciaEnteros[0] = 12;
		referenciaEnteros[1] = 13;
		referenciaEnteros[2] = 14;
		//referenciaEnteros[3] = 15; //esa posicion no existe
		
		//recorremos el array
		for (int i = 0; i < referenciaEnteros.length; i++) {
			System.out.println("Valor "+i+": "+referenciaEnteros[i]);
		}
		
		//Declaramos y creamos la referencia
		double[] referenciaDoubles = new double[3];
		
		//inicializamos los valores
		referenciaDoubles[0] = 12.1;
		referenciaDoubles[1] = 13.1;
		referenciaDoubles[2] = 14.1;
		
		//recorremos el array
		for (int i = 0; i < referenciaDoubles.length; i++) {
			System.out.printf("Valor %d: %.2f%n",i,referenciaDoubles[i]);
		}
		
		//Declaramos, creamos e inicializamos el array
		String[] referenciaCadenas = {"Hola", " ","mundo"};
		
		//recorremos el array
		for (int i = 0; i < referenciaCadenas.length; i++) {
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println();
		
		//Creamos e inicializamos un array boolean
		boolean[] referenciaBoolean = {true, false, true};
		
		//recorremos el array de forma clásica
		for (int i = 0; i < referenciaBoolean.length; i++) {
			System.out.printf("%b ",referenciaBoolean[i]);
		}
		System.out.println();
		
		//recorremos arrays con un bucle mejorado
		for(String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		
		System.out.println();
		
		for (boolean b : referenciaBoolean) {
			System.out.printf("%b ",b);
		}
	}
}
