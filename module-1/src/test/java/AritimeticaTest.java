import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AritimeticaTest {

    Aritimetica aritimetica = new Aritimetica();

    @Test
    void somar() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");

        // Action
        BigDecimal result = aritimetica.somar(a, b);

        // Assert
        assertEquals(new BigDecimal("7"), result);
    }

    @Test
    void subtrair() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");

        // Action
        BigDecimal result = aritimetica.subtrair(a, b);

        // Assert
        assertEquals(new BigDecimal("3"), result);
    }

    @Test
    void dividir() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");

        // Action
        BigDecimal result = aritimetica.dividir(a, b);

        // Assert
        assertEquals(new BigDecimal("2.5000"), result);
    }

    @Test
    void multiplicar() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");

        // Action
        BigDecimal result = aritimetica.multiplicar(a, b);

        // Assert
        assertEquals(new BigDecimal("10"), result);
    }
}