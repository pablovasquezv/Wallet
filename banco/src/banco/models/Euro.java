package banco.models;
//Importaciones
import banco.interfaces.IMoneda;

/**
 * @author Pablo
 */

/**
 * Clase: Euro
 */
public class Euro implements IMoneda {
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