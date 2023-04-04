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
public class Extras7 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {       
        Scanner leer = new Scanner(System.in);        
        int n;        
        double num, sum = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY; 
    System.out.print("Ingrese la cantidad de numeros:");
    n = leer.nextInt();       
    int i = 1;        
    do {            
        System.out.print("Ingrese el numero " + i + ": ");            
        num = leer.nextDouble();            
        sum += num;            
        max = Math.max(max, num);           
        min = Math.min(min, num);            
        i++;        } 
    while (i <= n); 
    double promedio = sum / n;      
    System.out.println("El valor maximo es: " + max);
            System.out.println("El valor minimo es: " + min);        
            System.out.println("El promedio es: " + promedio);        
            leer.close();
    }}

    