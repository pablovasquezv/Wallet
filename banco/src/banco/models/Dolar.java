package banco.models;
//Importaciones

import banco.interfaces.IMoneda;

/**
 * @author Pablo
 */

/**
 * Clase: Dolar
 */
public class Dolar implements IMoneda {

    /**
     * Método para obtener un simbolo Dólares
     *
     * @return USD
     */
    @Override
    public String getSimbolo() {
        return "USD";
    }

    /**
     * Método para obtener Factor Conversion.
     *
     * @return
     */
    @Override
    public double getFactorConversion() {
        return 1.0;
    }

    /**
     * Función para convertir las Monedas a dólares.
     *
     * @param otraMoneda
     * @param monto
     */
    @Override
    public void convertirMoneda(IMoneda otraMoneda, double monto) {
        double factorConversion = otraMoneda.getFactorConversion() / this.getFactorConversion();
        double montoConvertido = monto * factorConversion;
        System.out.println(monto + " " + this.getSimbolo() + " equivale a: " + montoConvertido + " " +
                otraMoneda.getSimbolo());
    }
}
