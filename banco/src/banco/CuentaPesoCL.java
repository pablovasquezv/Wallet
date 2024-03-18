package banco;

public class CuentaPesoCL extends Cuenta {

    /**
     *
     * @param monto
     */
    @Override
    public void depositar(double monto) {
        saldo=0.0;
        saldo += monto;//Asignar al saldo el monto
        System.out.println("Se a depositado " + monto + " de dinero en la cuenta.");
        System.out.println("El saldo actual es: " + saldo);
    }

    /**
     *
     * @param monto
     */
    @Override
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
}
