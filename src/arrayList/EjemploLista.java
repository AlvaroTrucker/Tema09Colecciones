package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class EjemploLista {

	public static void main(String[] args) {
		//creamos una lista de cadenas (String)
		List<String> listaCadenas = new ArrayList<String>();
		
		//añadimos mediante Scanner las cadenas
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadenas de texto(fin para acabar)");
		String cadena = sc.next();
		while(!cadena.toLowerCase().equals("fin")){
			listaCadenas.add(cadena);
			cadena = sc.next();
		}
		sc.close(); //cerramos el Scanner
		
		//conocemos el contenido de la lista
		System.out.println("Palabras escritas: "+listaCadenas);
		System.out.println("Numero de palabras escritas: "+listaCadenas.size());
		System.out.println("¿Contiene a Pedro?: "+listaCadenas.contains("Pedro"));
		if (listaCadenas.contains("Pedro"))
			System.out.println("Está en la posición "+listaCadenas.lastIndexOf("Pedro"));
		if (listaCadenas.size() > 0)
			System.out.println("Primera palabra: "+listaCadenas.get(0));
		
		//recorremos la lista e imprimimos las palabras en una única linea
		//forma 1: clásica
		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.println(listaCadenas.get(i));
		}
		
		//forma 2: bucle mejorado
		for (String string : listaCadenas) {
			System.out.println(string);
		}
		
		//forma 3: Java 8
		//listaCadenas.forEach(System.out::println);
	}
}
