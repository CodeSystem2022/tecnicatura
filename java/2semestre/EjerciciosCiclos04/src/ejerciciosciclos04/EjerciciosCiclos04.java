/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosciclos04;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class EjerciciosCiclos04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0 ){
                System.out.println("El numero es "+numero+" es positivo");
                conteo++;
                System.out.println("Digite otro numero ");
                numero=Integer.parseInt(entrada.nextLine());
                
        }
        System.out.println("A ingresado "+conteo+" numero que no son negativos");
    }
    }
    

