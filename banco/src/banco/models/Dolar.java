package banco.models;

/**
 * @author Pablo
 */

import banco.interfaces.IMoneda;

/**
 * Clase: Dolar
 */
public class Dolar implements IMoneda {
    @Override
    public String getSimbolo() {
        return null;
    }

    @Override
    public double getFactorConversion() {
        return 0;
    }

    @Override
    public void convertirMoneda(IMoneda moneda, double monto) {

    }
}
