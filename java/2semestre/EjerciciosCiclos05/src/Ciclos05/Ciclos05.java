/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y
luego ir pidiendo nuemeros indicando si es mayor o menor con respecto a N
Termina cuando el usuario acierta y mostramos el numero y los intentos
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        // Crear Scanner para leer del teclad
        Scanner entrada = new Scanner(System.in);
        int aleatorio, numero, conteo=0;
        // Generar número aleatorio entre 1 y 100
        aleatorio = (int)(Math.random()*100);
        //Explicamos el jeugo
        System.out.println("Adivina un número entre 0 y 100, el quue adiviene en menos intestos gana");
        do { 
            // Solicitar un número al usuario
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (aleatorio < numero) {
                System.out.println("El número: "+numero+" es mayor, piensa un número menor");
            } else if (aleatorio > numero) {
                System.out.println("El número: "+numero+" es menor, piensa un número mayor");
            }
            else{
                System.out.println("\t¡¡¡Felicitaciones!!! Adivinaste el número");
            }
            conteo++;
        } while (aleatorio != numero);
        
        System.out.println("\t    Adivinaste el número en: "+conteo+" intentos");
    }
}