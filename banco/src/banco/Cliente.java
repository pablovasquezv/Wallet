package banco;

/**
 * @author Pablo
 */

import java.util.Scanner;

/**
 * Clase: Cliente
 */
public class Cliente {
    //Atributos
    private Long ID;
    private String nombre;
    private Cuenta cuenta;

    /**
     * @param ID
     * @param nombre
     * @param cuenta
     */
    public Cliente(Long ID, String nombre, Cuenta cuenta) {
        this.ID = ID;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    /**
     * @return ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
