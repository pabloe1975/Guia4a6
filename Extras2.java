/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4a6;

/**
 *
 * @author Pablo
 */
public class Extras2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        int A,B,C,D, aux;
        A = 10;
        B = 5;
        C = 12;
        D = 2;
        aux = B;
        System.out.println("Valores iniciales");
        System.out.println(A + " \n"
                + B + "\n"
                + C + "\n"
                + D + "");
        A = D;
        B = C;
        C = A;
        D = aux;
        System.out.println("Valores finales");
        System.out.println(A + " \n"
                + B + "\n"
                + C + "\n"
                + D + "");
    }
    
}