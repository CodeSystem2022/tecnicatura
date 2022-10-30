/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase11_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class CLASE11_EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double descuento = 0, preciofinal, compra; 

Scanner entrada= new Scanner(System.in);
System.out.println("Introduzca el monto de la compra  :");
compra=entrada.nextDouble();
System.out.println("La compra es de: "+compra);

if(compra>=100){
descuento=compra*0.20;
}


System.out.println ("El descuento es de: " + descuento);
preciofinal= compra-descuento;
System.out.println ("El monto total de la venta es de: " + preciofinal);
} }
    