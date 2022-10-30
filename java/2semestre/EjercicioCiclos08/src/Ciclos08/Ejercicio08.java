/**
 Ejercicio 8 : pedir un numero N al usuario y mostrar todos los numero del 1 al N

 */
package Ciclos08;

import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int i = 1;
        while (i <= numero) {
          JoptionPane.showmessageDialog(null, i);
        i++;
        
    }
    }

}
