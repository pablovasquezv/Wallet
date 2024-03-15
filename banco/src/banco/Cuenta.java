package banco;

/**
 * @author Pablo
 */

/**
 * Clase: Cuenta
 */
public class Cuenta {
    private   Integer numero_cuenta;
    private String titular;
    private Double saldo;

    /**
     * @param numero_cuenta
     * @param titular
     * @param saldo
     */
    public Cuenta(Integer numero_cuenta, String titular, Double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Método para mostrar los valores de los atributos por pantalla
     */
    public void mostrarInformación() {
        System.out.println("Número de cuenta: " + numero_cuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
