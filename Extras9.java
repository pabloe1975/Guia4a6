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
public class Extras9 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args){ 
{        
    int dividendo;
    int divisor;
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Ingrese el dividendo: ");
                dividendo = sc.nextInt();
                System.out.print("Ingrese el divisor: ");        
                divisor = sc.nextInt();
            }
int cociente = 0;        
while (dividendo >= divisor) {            
dividendo -= divisor;            
cociente++; 
}       
int residuo = dividendo;        
System.out.println("El cociente es: " + cociente);
           
System.out.println("El residuo es: " + residuo);
    

}
    }
}
