package banco.models;
//Imports

import java.util.Scanner;

/**
 * @author Pablo
 */

/**
 * Clase: Cliente
 */
public class Cliente {
    //Atributos
    private Long ID;
    private String nombre;
    private Cuenta cuenta;

    /**
     * Constructor sin parámetros
     */
    public Cliente() {

    }

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

    /**
     * Método para crear un objeto Cliente pidiendo los datos al usuario
     *
     * @return Cliente
     */
    public static Cliente crearCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del Cliente: ");
        long id = scanner.nextLong();
        scanner.nextLine();//Limpieza de buffer
        System.out.println("Ingrese el nombre del Cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Creando la cuenta para el cliente......");
        Cuenta cuenta1 = Cuenta.crearCuenta();
        return new Cliente(id, nombre, cuenta1);
    }

    /**
     * Método para depositar en la cuenta
     *
     * @param monto
     */
    public void depositar(double monto) {
        cuenta.depositar(monto);
    }

    /**
     * Método para retirar de la cuenta
     *
     * @param monto
     */
    public void retirar(double monto) {
        cuenta.retirar(monto);
    }

    /**
     * Método para consultar los datos del cliente y su cuenta
     */
    public void consultarDatos() {
        System.out.println("ID del cliente: " + ID);
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Datos de la cuenta:");
        cuenta.mostrarInformación();
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
