import com.sun.javafx.scene.layout.region.Margins;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Ilya on 15.02.2016.
 */
public class Run {
    private static final Logger log = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.sqrt(10);
        formula.calculate(10);
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        log.info("before compare result:" + names.toString());
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        log.info("compare result:" + names.toString());
        names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });
        log.info("compare result:" + names.toString());
        Collections.sort(names, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));

        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));

        log.info("compare result:" + names.toString());
        String from1 = "123,23";

        ConverterInFace<String,Integer> converter = (from) -> Integer.valueOf(from);
        ConverterInFace<String,BigDecimal> converterBigDecimal = (from) -> new BigDecimal(from.replace(",",".")).setScale(2);
        BigDecimal result  = converterBigDecimal.convert(from1);
        log.info("converter from: " + from1+", after :" + result);

        class SomeClass {
            String StartsWith(String string){
                return String.valueOf(string.charAt(0));
            }
        }
        SomeClass someClass = new SomeClass();
        ConverterInFace<String, String> converterString = (from) -> String.valueOf(from.charAt(0));

    }
}
