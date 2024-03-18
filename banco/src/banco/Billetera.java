package banco;

/**
 * @author Pablo
 */

/**
 * Clase: Billetera
 */
public class Billetera {
   private FormaDePago metodoPago;

    /**
     *
     * @param metodoPago
     */
    public void setMetodoPago(FormaDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    /**
     *
     */
    public void realizarPago() {
        metodoPago.realizarPago();
    }
}
