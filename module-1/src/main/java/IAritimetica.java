import java.math.BigDecimal;

public interface IAritimetica {

    BigDecimal somar(BigDecimal a, BigDecimal b);
    BigDecimal multiplicar(BigDecimal a, BigDecimal b);
    BigDecimal dividir(BigDecimal a, BigDecimal b);
    BigDecimal subtrair(BigDecimal a, BigDecimal b);
}
