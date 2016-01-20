package ejerciciosDelTema;

public class TestColecciones1 {
	public static void main(String[] args) {
		Colecciones1 c = new Colecciones1();
		
		//asignar el valor 5 al último elemento
		int[] array = c.getArray();
		array[11] = 5;
		/*System.out.println(c);*/
		
		//asignar valor 3 al primer elemento
		c.setArray(0, 3);
		/*System.out.println(c);*/
		
		//asignar el doble del anterior
		for (int i = 1; i < c.getArray().length-1; i++) {
			c.setArray(i, c.getArray()[i-1]*2);
		}
		System.out.println(c);
		
		//suma de todos los numeros del array
		int suma = 0;
		for (int i = 0; i < c.getArray().length; i++) {
			suma += c.getArray()[i];
		}
		System.out.println("Suma de todos los números: "+suma);
		
		//cambiar valor del array y dividir entre 3 los cinco últimos numeros
		for (int i = c.getArray().length-5; i < array.length; i++) {
			c.setArray(i, c.getArray()[i]/3);
		}
		System.out.println(c);
		
		//calcular valor mas pequeño del array
		int valorMenor = c.getArray()[0];
		for (int i=0;i<c.getArray().length;i++){
			if (valorMenor>c.getArray()[i])
				valorMenor = c.getArray()[i];
		}
		System.out.println("Valor mas pequeño: "+valorMenor);
		
		System.out.println();
		
		//mostrar todos los numeros en 3 filas de 4 columnas
		int contador = 0;
		for (int i = 3; i > 0; i--) {
			for (int j = 4; j > 0; j--) {
				System.out.printf("%5d",c.getArray()[contador]);
				contador++;
			}
			System.out.println();
		}	
	}
}
