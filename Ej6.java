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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Decida que operacion matematica desea realizar");
        System.out.println("suma(1) resta(2) multiplicacion(3) division(4)");
        int op=leer.nextInt();
        switch(op){
        case 1:
            System.out.println("El resultado de la suma es " + suma(num, num2));
        break;
        case 2:
            System.out.println("El resultado de la resta es "+resta(num, num2));
        break;
        case 3:
            System.out.println("El resultado de la multiplicacion es "+ multiplicacion(num, num2));
        break;
        case 4:
            System.out.println("El resultado de la division es "+division(num, num2));
        break;
        default:
            System.out.println("La opcion elegida, no es valida");
        break;
    
    }
    }
  public static int suma (int a, int b){
        int c= a+b;
      return c;
  }  
  public static int resta (int a, int b){
        int c= a-b;
      return c;
  }  
  public static int multiplicacion (int a, int b){
        int c= a*b;
      return c;
  }  
  public static int division (int a, int b){
        int c= a/b;
      return c;
  }  
}
    