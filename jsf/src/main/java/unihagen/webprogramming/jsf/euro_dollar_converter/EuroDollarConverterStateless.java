package unihagen.webprogramming.jsf.euro_dollar_converter;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EuroDollarConverterStateless {

    @EJB
    private StatelessConverter converter;

    private Double input;
    private double euroToDollar;
    private double dollarToEuro;

    public void convert() {
        euroToDollar = converter.euroToDollar(input);
        dollarToEuro = converter.dollarToEuro(input);
    }

    public void setInput(Double input) {
        this.input = input;
    }
    public Double getInput() {
        return input;
    }

    public Double getEuroToDollar() {
        return euroToDollar;
    }
    public void setEuroToDollar(Double euroToDollar) {
        this.euroToDollar = euroToDollar;
    }

    public Double getDollarToEuro() {
        return dollarToEuro;
    }
    public void setDollarToEuro(Double dollarToEuro) {
        this.dollarToEuro = dollarToEuro;
    }
}
