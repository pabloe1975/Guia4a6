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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabra");
        String palabra = leer.nextLine();
        if(palabra.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    

    
}