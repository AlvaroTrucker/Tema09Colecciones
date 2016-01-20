package ejerciciosDelTema;

import java.util.Arrays;

public class Colecciones1 {
	//atributos
	private int[] array;

	//constructor
	public Colecciones1() {
		this.array = new int[12];
	}

	//getters
	public int[] getArray() {
		return array;
	}
	
	//setters
	public void setArray(int posicion, int valor) {
		if (posicion <= this.array.length)
			this.array[posicion] = valor;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	/*public int calcularLongitudArray(){
		return array.length();
	}*/
}
