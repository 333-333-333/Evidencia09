public class Juego {

	public static void iniciar() {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		try {
			jugar(dado1, dado2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			iniciar();
		}
	}

	public static void jugar(Dado dado1, Dado dado2) {
		Cara cara1 = dado1.tirar();
		Cara cara2 = dado2.tirar();

		System.out.println("Caras obtenidas : "
			+ "\n" + cara1.getRepresentacion()
			+ "\n" + cara2.getRepresentacion());

		int sumaCaras = sumarCaras(cara1, cara2);

		if (gano (sumaCaras)) {
			System.out.println("La suma de tus caras es 7, ganaste. :)");
		} else {
			System.out.println("La suma de tus caras es "
					+ sumaCaras
					+ ", perdiste. :(");
		}
	}

	public static int sumarCaras(Cara cara1, Cara cara2) {
		return Calculadora.sumar(cara1.getValor(), cara2.getValor());
	}

	public static boolean gano(int sumaCaras) {
		return sumaCaras == 7;
	}

}