package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDatos {

	public static void main(String[] args) {
		List<Double> temperaturas = new ArrayList<Double>();
		//usamos Scanner para leer los datos
		Scanner in = new Scanner(System.in);
		
		//leemos el numero de datos y después los datos
		System.out.println("Introduce nº datos a leer y posteriormente los datos");
		int numeroDatos = in.nextInt();
		for (int i = 0; i < numeroDatos; i++) {
			temperaturas.add(in.nextDouble());
		}
		
		//cerramos el Scanner por temas de memoria
		in.close();
		
		Datos d = new Datos(temperaturas);
		System.out.println(d);
		System.out.println("Datos estadísticos");
		System.out.printf("Valor medio: %.2f, desviación típica: %.2f y valor por debajo de la media: %.2f", 
				d.calcularValorMedio(),d.calcularDesviacionTipica(),d.calcularNValoresMedia());
	}

}
