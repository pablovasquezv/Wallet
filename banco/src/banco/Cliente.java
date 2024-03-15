package banco;

/**
 * @author Pablo
 */

/**
 * Clase: Cliente
 */
public class Cliente {
    //Atributos
    private Integer ID;
    private String nombre;
    private Cuenta cuenta;

    /**
     *
     * @param ID
     * @param nombre
     * @param cuenta
     */
    public Cliente(Integer ID, String nombre, Cuenta cuenta) {
        this.ID = ID;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
}
