import java.util.ArrayList;

public class Dado {
	private ArrayList<Cara> Caras;

	public Dado() {
		this.Caras = new ArrayList<>();
		for (Cara cara : Cara.values()) {
			Caras.add(cara);
		}
	}

	public Cara tirar() {
		return this.Caras.get((int) (Math.random() * this.Caras.size()));
	}

}