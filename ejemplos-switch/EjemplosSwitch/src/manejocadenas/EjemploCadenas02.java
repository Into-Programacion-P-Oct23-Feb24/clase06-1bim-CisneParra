/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploCadenas02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // permite ingresar datos por teclado
        entrada.useLocale(Locale.US); // permite estandarizar el codigo
        String cadenaFinal = "Datos Ingresados\n";

        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine(); // Quito

        cadenaFinal = String.format("%sCiudad:%s\n",
                cadenaFinal, ciudad);
        /*
        String.format es parecido al printf pero sirve para reemplazar un valor para
        una cadena
         */
        //System.out.printf( "%s\n", cadenaFinal );
 
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine(); // 
        
        cadenaFinal = String.format("%sProvincia:%s\n",  
                cadenaFinal,
                provincia);
        
        System.out.println("Ingrese la país");
        String pais = entrada.nextLine(); // 
        
        cadenaFinal = String.format("%sPaís:%s\n",  
                cadenaFinal, 
                pais);
        
        System.out.printf("%s", cadenaFinal);
        /* 
        De manera resumida este tipo de string acumula todas las variables
        dadas por teclado dentro de otra variable
        dandole asi bastantes variables en ella sola
        sirve para darle un mejor uso a el printf y solo presentar una sola variable
        en vez de usar bastantes variables dentro de un print
        */
         
    }
}
