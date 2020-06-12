import java.math.BigDecimal;

public class AritimeticaAvancada implements IAritimeticaAvancada {

    @Override
    public BigDecimal expoente(BigDecimal a) {
        return a.multiply(a);
    }

    @Override
    public BigDecimal raizQuadrada(BigDecimal a) {
        return new BigDecimal(String.valueOf(Math.sqrt(Long.parseLong(a.toPlainString()))));
    }
}
