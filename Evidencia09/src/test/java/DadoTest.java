import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    private Dado Test;

    @BeforeEach
    void init() {
        this.Test = new Dado();
    }

    @DisplayName("[tirar] Comprueba la fidelidad del método")
    @Test
    void tirarFIdelidad() {
        ArrayList<Integer> valoresPosibles = new ArrayList<>();
        for (int valor = 1; valor <= 6; valor++) {
            valoresPosibles.add(valor);
        }
        assertTrue(valoresPosibles.contains(this.Test.tirar().getValor()));
    }

}