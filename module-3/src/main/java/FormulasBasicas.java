import java.math.BigDecimal;

public class FormulasBasicas implements IFormulasBasicas {

    @Override
    public BigDecimal fatorial(BigDecimal a) {
        if(a == null || a.equals(BigDecimal.ZERO))
            return BigDecimal.ZERO;

        long result = 1L;
        for(long c = a.intValue(); c > 0; c--){
            result *= c;
        }

        return new BigDecimal(result);
    }
}
