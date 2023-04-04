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
public class Extras5 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char socioTipo;
        do {
            System.out.println("ingrese tipo de socio");
            socioTipo = leer.next().toLowerCase().charAt(0);
            System.out.println("ingrese importe del tratamiento");
            double importe = leer.nextDouble();
            switch (socioTipo) {
                case 'a':
                    System.out.println("Importe con desc (50%) $" + importe * 0.5);
                    break;
                case 'b':
                    System.out.println("Importe con desc (35%) $" + importe * 0.35);
                    break;
                case 'c':
                    System.out.println("importe sin desc $" + importe);
                    break;
                default:
                    System.out.println("categoria no existente");
            }

        } while (socioTipo != 'a' && socioTipo != 'b' && socioTipo != 'c');
}
    }