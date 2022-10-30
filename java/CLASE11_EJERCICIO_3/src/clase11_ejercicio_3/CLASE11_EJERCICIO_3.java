/*
 EJERCICIO LEER LOS NUMEROS SIN SON IGUALES LO MULTIPLICAMOS SI EL PRIMERO ES MAYOR
QUE EL SEGUNDO QUE LO RESTE Y SI NO QUE LOS SUME.
 */
package clase11_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class CLASE11_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        double num1,num2,resultado;
 System.out.println("digite primer numero :");
 num1 = dato.nextInt();
 
 System.out.println("digite segundo numero :");
 num2 = dato.nextInt();
 
if (num1 == num2) {
    resultado = num1 * num2;
}else if (num1>num2){
    resultado = num1 - num2;
}else{
    resultado = num1 + num2;
}
System.out.println("el resultado es :  " + resultado);

    }
    
    }
