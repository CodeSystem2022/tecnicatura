/* Una compañia de autos usados paga a su personal de ventas un salario
de $1000 mensuales mas una comision de $150 por cada auto vendido
mas el 5% del valor de la venta por auto
cada mes el capturista de la empresa ingresa los datos 
*calule e imprima el salario mensual de vendedor
*el salario de 1000 sera un dato constante (hay que agregar la palabra reservada
"final"

 */


/**
 *
 * @author mauri
 */



package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision =150, cantAutosVendidos;
        float porcentaje, salarioTotal, precioAuto;
        String nombreVendedor;
        
        System.out.println("Digite el nombre del vendedor: ");
        nombreVendedor = entrada.nextLine();
        System.out.println("Digite la cantidad de autos vendidos: ");
        cantAutosVendidos = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el valor de un auto: ");
        precioAuto = Float.parseFloat(entrada.nextLine());
        
        comision = comision*cantAutosVendidos;
        porcentaje = (cantAutosVendidos*precioAuto)*0.05f;
        salarioTotal = salario + comision + porcentaje;
        
        System.out.println("El salario mensual de " + nombreVendedor + "es: " + salarioTotal);
    }
    
}
