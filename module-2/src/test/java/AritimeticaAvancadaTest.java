import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AritimeticaAvancadaTest {

    IAritimeticaAvancada aritimeticaAvancada = new AritimeticaAvancada();

    @Test
    void expoente() {
        BigDecimal a = new BigDecimal("2");
        BigDecimal actual = aritimeticaAvancada.expoente(a);
        assertEquals(new BigDecimal("4"), actual);
    }

    @Test
    void raizQuadrada() {
        BigDecimal a = new BigDecimal("4");
        BigDecimal actual = aritimeticaAvancada.raizQuadrada(a);
        assertEquals(new BigDecimal("2.0"), actual);
        a = new BigDecimal("9");
        actual = aritimeticaAvancada.raizQuadrada(a);
        assertEquals(new BigDecimal("3.0"), actual);
    }
}