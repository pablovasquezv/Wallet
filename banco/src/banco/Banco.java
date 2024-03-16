/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 * @author Pablo
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Cuando llamas al método de esta manera: Cliente cliente = new Cliente(); cliente.crearCliente();
         * te devuelve un objeto vacío porque estás creando una nueva instancia de la clase Cliente con el
         * constructor predeterminado new Cliente(), y luego estás llamando al método crearCliente() en esa
         * instancia recién creada. Esto significa que el método crearCliente() se ejecuta en una instancia separada
         * de la clase Cliente, que no está siendo asignada a ninguna variable.
         *
         * Por otro lado, cuando llamas al método de esta manera: Cliente cliente = Cliente.crearCliente(); y el método
         * crearCliente debe ser estático, obtienes un objeto con los datos correctamente porque estás llamando al
         * método directamente en la clase Cliente, lo que significa que el método está asociado con la clase en sí y no
         * con una instancia específica.
         */
        // Instanciar una cuenta
        //Cuenta billetera1= new Cuenta(12323,"pablo",2343.2);
        // Mostrar los valores de los atributos por pantalla
        Cliente cliente = Cliente.crearCliente();
        cliente.consultarDatos();
        cliente.depositar(1000.2);
        cliente.retirar(10400.2);
        // Mostrar los valores de los atributos por pantalla
        Cuenta billetera1 = Cuenta.crearCuenta();
        billetera1.depositar(1000.2);
        billetera1.retirar(98.2);
        billetera1.mostrarInformación();
    }

}
