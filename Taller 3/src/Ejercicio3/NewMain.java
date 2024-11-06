
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona("", 0);
        
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(entrada.nextLine());
        System.out.println("ingrese la edad de la persona:");
        persona.edad = entrada.nextInt();
        
        System.out.println("nombre de la persona: "
                + persona.getNombre() + " edad: "
                        + persona.edad);
    }
    
}
