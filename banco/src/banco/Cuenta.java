package banco;

/**
 * @author Pablo
 */

import java.util.Scanner;

/**
 * Clase: Cuenta
 */
public class Cuenta {
    private Integer numero_cuenta;
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
     * @return numero_cuenta
     */
    public Integer getNumero_cuenta() {
        return numero_cuenta;
    }

    /**
     * @param numero_cuenta
     */
    public void setNumero_cuenta(Integer numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    /**
     * @return titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo
     */
    public void setSaldo(Double saldo) {
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

    /**
     * Método para crear un objeto Cuenta pidiendo los datos al usuario
     *
     * @return Cuenta
     */

    public static Cuenta crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la cuenta: ");
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();
        System.out.println("Ingrese el saldo Inicial: ");
        double saldoIncial = scanner.nextDouble();
        return new Cuenta(numeroCuenta, titular, saldoIncial);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Cuenta{" +
                "numero_cuenta=" + numero_cuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
