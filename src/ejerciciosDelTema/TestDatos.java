package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDatos {

	public static void main(String[] args) {
		List<Double> temperaturas = new ArrayList<Double>();
		//usamos un Scanner para leer datos
		Scanner in = new Scanner(System.in);
		//leemos el nº de datos y posteriormente los datos
		System.out.println("Introduce nº datos a leer y posteriormente los datos");
		int numeroDatos = in.nextInt();
		for (int i = 0; i < numeroDatos; i++) {
			temperaturas.add(in.nextDouble());
		}
		//cerramos el Scanner
		in.close(); //por tema de memoria
		Datos datos = new Datos(temperaturas);
		System.out.println(datos);
		System.out.println("Datos estadísticos");
		System.out.printf("Valor medio %.2f, desviación típica %.2f y valor por debajo de la media %d%n", 
				datos.calcularValorMedio(),datos.calcularDesviacionTipica(),
				datos.calcularNValoresMedia());
		System.out.printf("Valor máximo %.2f y valor mínimo %.2f%n",
				datos.calcularValorMaximo(),datos.calcularValorMinimo());

	}

}
