public enum Cara {
	UNO(1, "."),
	DOS(2, ":"),
	TRES(3, ":."),
	CUATRO(4, "::"),
	CINCO(5, "::."),
	SEIS(6, ":::");

	private int Valor;
	private String Representacion;

	private Cara(int valor, String representacion) {
		this.Valor = valor;
		this.Representacion = representacion;
	}

	public int getValor() {
		return this.Valor;
	}

}