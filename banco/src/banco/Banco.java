/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Pablo
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar una cuenta
        Cuenta billetera1= new Cuenta(12323,"pablo",2343.2);

        // Mostrar los valores de los atributos por pantalla
        billetera1.mostrarInformación();
    }
    
}
