import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Formula implements FormulaInFace {
    public static final Logger log = LoggerFactory.getLogger(Formula.class);

    public double calculate(int i) {
        double result =  100 * sqrt(10);
        log.info("calculate :" + result);
        return result;
    }
}
