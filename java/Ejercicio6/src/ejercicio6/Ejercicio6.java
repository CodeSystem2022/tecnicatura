// Guillermo tiene N dolares. Luis tiene la mitas de lo que posee Guillermo
//Juan tiene la mitad de lo que poseen Luis y  Guillermo juntos
//calculer e imprima la cantidad que tienen entre los tres.

/**
 *
 * @author mauri
 */

package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Guillermo, Luis, Juan, Suma;
        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        Guillermo = Float.parseFloat(entrada.nextLine());
        
        Luis = Guillermo /2;
        Juan = (Guillermo+Luis)/2;
        Suma = Guillermo + Juan + Luis;
        
        System.out.println("Luis tiene: $"+Luis);
        System.out.println("Juan tiene: $ "+ Juan);
        System.out.println("Los tes juntos tienen: $"+Suma);
        
    }
    
}

