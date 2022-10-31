import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @DisplayName ("[sumar] Comprueba la fidelidad del método.")
    @Test
    void sumarFidelidad() {
        assertEquals(2, Calculadora.sumar(1, 1));
    }

}