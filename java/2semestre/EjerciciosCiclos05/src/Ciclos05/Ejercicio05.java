/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y
luego ir pidiendo nuemeros indicando si es mayor o menor con respecto a N
Termina cuando el usuario acierta y mostramos el numero y los intentos
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
public static void main(String[] args) {
        int aleatorio, numero, conteo=0;
        // Generar número aleatorio entre 1 y 100
        aleatorio = (int)(Math.random()*100);
        // Explicamos el juego
        JOptionPane.showMessageDialog(null,"Adivina un número entre 0 y 100, el quue adiviene en menos intestos gana");
        do {
            // Crear JOptionPane para leer del teclado
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if (aleatorio < numero) {
                JOptionPane.showMessageDialog(null,"El número: "+numero+" es mayor, piensa un número menor");
            } else if (aleatorio > numero) {
                JOptionPane.showMessageDialog(null,"El número: "+numero+" es menor, piensa un número mayor");
            }
            else{
                JOptionPane.showMessageDialog(null,"¡¡¡Felicitaciones!!! Adivinaste el número");
            }
            conteo++;
        } while (aleatorio != numero);
        
        JOptionPane.showMessageDialog(null,"Adivinaste el número en: "+conteo+" intentos");
    }
}