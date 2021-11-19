package entities;

public class CurrencyConverter {

        public static final double IOF = 0.06;


        public static double valor(double dollar, double reais) {
            return dollar * reais * (IOF + 1.0) ;

        }


}
