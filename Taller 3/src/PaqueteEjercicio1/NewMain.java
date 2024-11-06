
package PaqueteEjercicio1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNum = new Scanner(System.in);
        
        Ejercicio1_Producto producto = new Ejercicio1_Producto("", 0, 0);
        
        System.out.println("ingrese el nombre del producto:");
        producto.nombre = entradaTexto.nextLine();
        System.out.println("ingresa el precio del producto:");
        producto.precio = entradaNum.nextDouble();
        System.out.println("ingresa el stock del producto:");
        producto.stock = entradaNum.nextInt();
        
        System.out.println("info del producto: "
                + "nombre: " + producto.nombre + 
                ", precio: " + producto.precio +
                ", stock: " + producto.stock);
        
    }
    
}
