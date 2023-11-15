/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreCompleto;

        System.out.println("Ingrese sus nombres");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su universidad");
        String universidad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        nombreCompleto = String.format("%s %s", nombre, apellido);
        nombreCompleto = nombreCompleto.toLowerCase();

        // nombre = "atacames"
        char valor = nombreCompleto.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                nombreCompleto = nombreCompleto.toUpperCase();
                System.out.printf("%s con edad %d, es estudiante de %s",
                        nombreCompleto, edad, universidad);
                break;

            default:
                nombreCompleto = nombreCompleto.toLowerCase();
                System.out.printf("%s con edad %d, es estudiante de %s",
                        nombreCompleto, edad, universidad);
                break;

        }

    }
}
