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

    /**
     *
     * @return ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
