public class Calculadora {

	public static int sumar(int valor1, int valor2) {

		if (valor1 == Integer.MAX_VALUE || valor2 == Integer.MAX_VALUE) {
			throw new StackOverflowError("El valor es muy grande.");
		}

		if (valor1 + valor2 >= Integer.MAX_VALUE) {
			throw new StackOverflowError("La suma de estos números no es procesable.");
		}

		return valor1 + valor2;
	}

}