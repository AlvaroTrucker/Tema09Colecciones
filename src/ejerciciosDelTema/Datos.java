package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Alvaro
 * @version 1.0
 * Clase que incorpora una colección de datos
 * y realiza operaciones estadístiscas sobre ellos
 */
public class Datos {
	//atributos de acuerdo al UML
	private List<Double> temperaturas;

	/**
	 * @param temperaturas
	 */
	public Datos(List<Double> temperaturas) {
		this.temperaturas = temperaturas;
	}
	/**
	 * 
	 * @return valor medio
	 */
	public double calcularValorMedio(){
		double suma = 0;
		for (Double double1 : temperaturas) {
			suma += double1;
		}
		return suma/this.temperaturas.size();
	}
	/**
	 * 
	 * @return desviación típica
	 */
	public double calcularDesviacionTipica(){
		double suma = 0;
		for (Double double1 : temperaturas) {
			suma += Math.pow(double1-this.calcularValorMedio(),2);
		}
		return Math.sqrt(suma/(this.temperaturas.size()-1));
	}
	/**
	 * 
	 * @return número de valores por debajo de la media
	 */
	public int calcularNValoresMedia(){
		int contador = 0;
		for (Double double1 : temperaturas) {
			if (double1 < this.calcularValorMedio())
				contador++;
		}
		return contador;
	}
	/**
	 * 
	 * @return temperatura máxima
	 */
	public double calcularValorMaximo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(
				this.temperaturas.size()-1);
	}
	/**
	 * 
	 * @return temperatura mínima
	 */
	public double calcularValorMinimo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(0);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Datos [temperaturas=" + temperaturas + "]";
	}
	
}