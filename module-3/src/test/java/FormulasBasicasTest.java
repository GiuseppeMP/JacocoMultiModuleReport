import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FormulasBasicasTest {

    IFormulasBasicas formulasBasicas = new FormulasBasicas();

    @Test
    void fatorial() {
        // Arrange
        BigDecimal a = new BigDecimal("4");

        // Act
        BigDecimal actual = formulasBasicas.fatorial(a);

        //Assert
        assertEquals(new BigDecimal("24"), actual);

        // Arrange
         a = new BigDecimal("0");

        // Act
         actual = formulasBasicas.fatorial(a);

        //Assert
        assertEquals(new BigDecimal("0"), actual);


        // Arrange
        a = null;

        // Act
        actual = formulasBasicas.fatorial(a);

        //Assert
        assertEquals(new BigDecimal("0"), actual);
    }
}