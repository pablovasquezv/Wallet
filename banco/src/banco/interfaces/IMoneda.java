package banco.interfaces;

/**
 * @author Pablo
 */

/**
 * Interface: IMoneda
 */
public interface IMoneda {
    //Atributos
    String getSimbolo();
    double  getFactorConversion();
    void convertirMoneda(IMoneda moneda,double monto);
}
