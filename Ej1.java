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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          int num,mod;
          System.out.println(" Ingrese numero si es par o impar");
          num = leer.nextInt();
          mod = num % 2;
          if (mod == 0){
              System.out.println(" El numero es par");
          }else{
              System.out.println(" El numero es impar");
          }
        
    }
    
}