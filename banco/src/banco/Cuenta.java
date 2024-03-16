package banco;

/**
 * @author Pablo
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase: Cuenta
 */
public class Cuenta {
    private Integer numero_cuenta;
    private String titular;
    private Double saldo;

    /**
     * Constructor sin parámetros
     */
    public Cuenta() {

    }

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
        double saldoIncial = 0;
        boolean saldoValido = false;
        while (!saldoValido) {
            System.out.println("Ingrese el saldo Inicial: ");
            try {
                saldoIncial = scanner.nextDouble();
                saldoValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese el un valor númerico para el saldo!");
                scanner.nextLine();
            }
        }
        return new Cuenta(numeroCuenta, titular, saldoIncial);
    }

    /**
     * Método para depositar en la cuenta
     *
     * @param monto
     */
    public void depositar(double monto) {
        saldo += monto;//Asignar al saldo el monto
        System.out.println("Se a depositado " + monto + " de dinero en la cuenta.");
        System.out.println("El saldo actual es: " + saldo);
    }

    /**
     * Método para retirar de la cuenta
     *
     * @param monto
     */
    public void retirar(double monto) {
        /**
         * En este operador ternario, la condición verifica si el monto es menor o igual al saldo. Si es verdadero,
         * resta el monto del saldo y muestra un mensaje con el monto retirado y el saldo actual. Si es falso,
         * muestra un mensaje de fondos insuficientes para realizar el retiro.
         */
        saldo = (monto <= saldo) ? (saldo - monto) : saldo;
        System.out.println((monto <= saldo) ? "Se han retirado " + monto + " de dinero en la cuenta.\n " +
                "El saldo actual es: " + saldo : "No tiene saldo suficiente para realizar un retiro!");
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