import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Classe responsável por operações Aritimeticas
 */
public class Aritimetica implements IAritimetica{

    public BigDecimal somar(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    public BigDecimal subtrair(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    public BigDecimal dividir(BigDecimal a, BigDecimal b){
        return a.divide(b, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal multiplicar(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

}
