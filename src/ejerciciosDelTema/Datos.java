/**
 * @author Alvaro
 * @version 1.0
 * Clase que incorpora una coleccion de datos
 * y realiza operaciones estadísticas sobre ellos
 */

package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Datos {
	//atributos
	private List<Double> temperaturas;

	//constructor
	public Datos(List<Double> temperaturas) {
		this.temperaturas = new ArrayList<Double>();
	}
	
	//metodo que devuelve el valor medio
	public double calcularValorMedio(){
		double suma = 0;
		for (Double double1 : temperaturas) {
			suma += double1;
		}
		return suma/this.temperaturas.size();
	}
	
	//metodo para calcular la desviacion típica
	public double calcularDesviacionTipica(){
		double suma = 0;
		for (Double double1 : temperaturas) {
			suma += Math.pow(this.calcularValorMedio(), 2);
		}
		return Math.sqrt(suma/(this.temperaturas.size()-1));
	}
	
	//metodo para calcular N valores por debajo de la media
	public int calcularNValoresMedia(){
		int contador = 0;
		for (Double double1 : temperaturas) {
			if (double1 < this.calcularValorMedio())
				contador++;
		}
		return contador;
	}
	
	//metodo para calcular el valor máximo
	public double calcularValorMaximo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(this.temperaturas.size()-1);
	}
	
	//metodo para calcular el valor mínimo
	public double calcularValorMinimo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(0);
	}

	@Override
	public String toString() {
		return "Datos [temperaturas=" + temperaturas + "]";
	}
}
