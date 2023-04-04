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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nro, suma, cont;
        suma =0;
        cont= 0;
        Scanner   leer = new Scanner(System.in);
        
        do {
             
        System.out.println("Ingrese por favor 10 números alearorios");
        nro = leer.nextInt(); 
        suma = suma + nro;
        cont=cont +1;
        if (nro == 0){
            System.out.println("Se capturó el número 0");
            break;
        }
        } while (cont<=9);
        //System.out.println("Se capturó el nro 0 ");
        System.out.println("La suma de los números ingresados fue de: " + suma + " y la cantidad de nros " + cont);
        // TODO code application logic here
    }
    
}