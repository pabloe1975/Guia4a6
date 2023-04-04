/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4a6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras8 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        //boolean salida = true;
        int num, cont = 0, cont_Par = 0, cont_Imp = 0;

        do {
            System.out.println("Ingrese numeros enteros");
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            cont++;
            if (num % 2 == 0 && num % 5 != 0 && num > 0) {
                cont_Par++;
            }
            if (num % 2 == 1 && num % 5 != 0 && num > 0) {
                cont_Imp++;
            }
            if (num % 5 == 0) {
                break;
            }

        } while (num > 0);

        System.out.println("Impares ingresados " + cont_Imp);
        System.out.println("Pares ingresados" + cont_Par);
        System.out.println("Números ingresados " + (cont_Par + cont_Imp));
        System.out.println("Se rompe el ciclo al ingresar un número multiplo de 5 y este último  no se contabiliza");

    }
}