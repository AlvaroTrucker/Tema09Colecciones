package ejerciciosDelTema;

public class TestColecciones1 {
	public static void main(String[] args) {
		Colecciones1 c = new Colecciones1();
		int[] array = c.getArray();
		array[11] = 5;
		System.out.println(c);
	}
}
