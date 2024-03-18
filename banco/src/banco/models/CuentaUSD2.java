package banco.models;

/**
 * @author Pablo
 */

import banco.models.CuentaDigital;

/**
 * Clase: CuentaUSD2
 */
public class CuentaUSD2 extends CuentaDigital {

    /**
     *
     */
    @Override
    public void verificarFondos() {
        // Lógica para verificar fondos en dólares
        System.out.println("Verificando fondos en dólares...");
    }
}
