package unihagen.webprogramming.jsf.euro_dollar_converter;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class StatelessConverter {

    private final static Double EURO_TO_DOLLAR_RATE = 1.317;

    public double euroToDollar(double euro) {
        return euro * EURO_TO_DOLLAR_RATE;
    }

    public double dollarToEuro(double dollar) {
        return dollar / EURO_TO_DOLLAR_RATE;
    }
}
