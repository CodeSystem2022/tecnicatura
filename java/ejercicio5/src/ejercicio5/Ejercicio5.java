/**
 *
 * @author mauri
 */

// Hacer un programa que calculee imprima la suma de 3 calificaciones
//pedir las calificaciones al usuario

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        System.out.println("Digite la 1 calificacion: ");
        nota1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la 2 calificacion: ");
        nota2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la 1 calificacion: ");
        nota3 = Float.parseFloat(entrada.nextLine());
        suma = nota1 +nota2 + nota3;
        System.out.println("la suma es: " + suma);
    }
}
