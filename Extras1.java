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
public class Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tiempo,dias,horas;
       
        System.out.println(" Ingrese el tiempo en minutos");
        tiempo = leer.nextInt();
       
       horas= tiempo / 60;
       
        dias = horas / 24;
        
      horas = horas % 24;
        
        System.out.println( + tiempo +" minutos son :" + dias +" Dias "+ horas + " Horas");
                
    }
    
}