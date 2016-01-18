package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEnteros {

	public static void main(String[] args) {
		//leemos mediante Scanner 10 numeros enteros
		//hacemos operaciones con ellos
		//definimos el Scanner
		Scanner in = new Scanner(System.in);
		
		//Definimos la lista sin elemento alguno
		List<Integer> listaEnteros = new ArrayList<Integer>();
		System.out.println("Introduce 5 numeros enteros");
		for (int i = 0; i < 5; i++) {
			listaEnteros.add(in.nextInt());
		}
		
		//cerramos el Scanner
		in.close();
		
		System.out.println(listaEnteros);
		
		//imprimir el tamaño de la lista
		System.out.println("Tamaño: "+listaEnteros.size());
		
		//primer elemento de la lista
		if (listaEnteros.size() > 0){
			System.out.println("Primer elemento: "+listaEnteros.get(0));
		}
		
		//añadir otro elemento
		listaEnteros.add(56);
		
		//añadir otro elemento a la posicion 0
		listaEnteros.add(0, 100);
		System.out.println(listaEnteros);
		
		//quitamos elementos
		listaEnteros.remove(0);
		listaEnteros.remove(4);
		listaEnteros.remove(new Integer(1));
		System.out.println(listaEnteros);
	}

}
