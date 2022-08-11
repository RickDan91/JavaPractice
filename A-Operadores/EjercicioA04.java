/*
 * Ejercicio A-04:
 * Una compañia de venta de carros usados, paga a su personal de ventas un
 * salario de $1000 mensuales, mas una comision de $150 por cada carro vendido,
 * mas el 5% del valor de la venta por carro. Cada mes el capturista de la
 * empresa ingresa en la computadora los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor
 * dado.
 */

import java.util.Scanner;
public class EjercicioA04 {
    public static void main(String[] args) {
        float valorAuto, salario;
        int cantAuto;
        final int base= 1000;
        Scanner entra=new Scanner(System.in);
        System.out.println("Cantidad de carros vendidos: ");
        cantAuto=entra.nextInt();
        System.out.println("Dinero total de carros vendidos: ");
        valorAuto=entra.nextFloat();
        salario=base+(150*cantAuto)+(0.005f*valorAuto);
        System.out.println("El salario de este empleado sera de $"+salario);
    }
}
