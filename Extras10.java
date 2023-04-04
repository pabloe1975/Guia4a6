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
public class Extras10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = (int) (Math.random() * 11); // Generar primer número aleatorio
            int num2 = (int) (Math.random() * 11); // Generar segundo número aleatorio
            int resultado = num1 * num2; // Calcular el resultado de la multiplicación
            int respuestaUsuario;
            do {
                System.out.print("Adivine el resultado de la multiplicación de " + num1 + " y " + num2 + ": ");
                respuestaUsuario = sc.nextInt(); // Leer respuesta del usuario
                if (respuestaUsuario == resultado) {
                    System.out.println("¡Respuesta correcta!");
                } else {
                    System.out.println("Respuesta incorrecta, inténtelo de nuevo.");
                }
            } while (respuestaUsuario != resultado);
        } // Generar primer número aleatorio
    }
}