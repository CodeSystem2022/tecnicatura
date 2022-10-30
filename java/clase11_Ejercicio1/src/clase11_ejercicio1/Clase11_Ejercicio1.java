/*
Ejercicio 1 calcular la nota promedio.
 */
package clase11_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Clase11_Ejercicio1 {

    public static void main(String args[]) {
         int nota1, nota2, nota3, promedio;
         
         Scanner dato = new Scanner(System.in);
 System.out.println("Ingrese la primera nota ;");
 nota1 = dato.nextInt();
 System.out.println("Ingrese la segunda nota ;");
 nota2 = dato.nextInt();
 System.out.println("Ingrese la tercera nota ;");
 nota3 = dato.nextInt();

 promedio = (nota1+nota2+nota3)/3;   
 if(promedio>=70){
 System.out.println(" APROBADO");
 System.out.println(" Su promedio es :" + promedio);
 } else {
 System.out.println(" NO APROBADO");
 System.out.println(" Su promedio es :" + promedio);
 }
 
         
        
    }
    }
    
    

