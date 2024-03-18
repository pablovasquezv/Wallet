package banco.interfaces;

/**
 * @author Pablo
 */

import banco.models.Moneda;

/**
 * Interface: IMoneda
 */
public interface IMoneda {
    //Atributos
    String getSimbolo();
    double  getFactorConversion();
    void convertirMoneda(IMoneda moneda,double monto);
}
