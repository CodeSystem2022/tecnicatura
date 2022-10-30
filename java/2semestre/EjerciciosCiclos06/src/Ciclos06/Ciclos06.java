/* Ejercicio 6:PEdir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos

 */
package Ciclos06;

import java.util.Scanner;


public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Scaner es el constructor de la clase scanner, mismo nombre
        int numero, suma =0;
         do{
             System.out.println("Digite un numero");
             numero = Integer.parseInt(entrada.nextLine());
             suma+= numero;
         }while(numero!=0);
         System.out.println("\nLa suma de todos los nuemeros ingresados es: "+suma);
    }
    
}
