package banco;

/**
 * @author Pablo
 */

/**
 * subClase: CuentaCorriente
 */
public class CuentaCorriente extends Cuenta {
    /**
     *
     */
    public CuentaCorriente() {
    }

    /**
     *
     * @param numero_cuenta
     * @param titular
     * @param saldo
     */
    public CuentaCorriente(Integer numero_cuenta, String titular, Double saldo) {
        super(numero_cuenta, titular, saldo);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numero_cuenta=" + numero_cuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
