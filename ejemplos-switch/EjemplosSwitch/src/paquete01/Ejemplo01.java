/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();

        switch (cadena) { // compara las variables con la respuesta dada por teclado
            case "Lunes": // en caso de: hacer tal cosa
            case "lunes":
            case "LUNES":
                System.out.printf("%s\n, es el primer día de la semana", cadena);
                break; // sentencia a forzar el detenimiento del switch

            case "Martes":
            case "martes": // se puede poner mas de un case para darle diferentes opciones para comparar
            case "MARTES":
                System.out.printf("%s\n, es el segundo día de la semana", cadena);
                break;
                
            case "Miércoles":
            case "miercoles":
            case "miércoles":
                System.out.printf("%s\n, es el tercer día de la semana", cadena);
                break;
                
            case "Jueves":
            case "jueves":
            case "JUEVES":
                System.out.printf("%s\n, es el cuarto día de la semana", cadena);
                break;

            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s\n, es el quinto día de la semana", cadena);
                break;
                
            case "Sábado":
            case "sabado":
            case "sábado":
                System.out.printf("%s\n, es el sexto día de la semana", cadena);
                break;
                
            case "Domingo":
                System.out.printf("%s\n, es el séptimo día de la semana", cadena);
                break;

            default:
                System.out.println("ninguna de las anteriores");
                break;
        }

    }
}
