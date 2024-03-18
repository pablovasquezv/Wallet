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
    void convertirMoneda(IMoneda otraMoneda,double monto);
}
