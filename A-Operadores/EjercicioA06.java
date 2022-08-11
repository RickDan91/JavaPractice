/*
 * Ejercicio A-06:
 * Hacer un programa que calcule el cuadrado de una suma. 
 */

import java.util.Scanner;

public class EjercicioA06 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double numa, numb, suma, cuadrado;
        System.out.print("Escriba dos numeros: ");
        numa=scn.nextDouble();
        numb=scn.nextDouble();
        suma=numa+numb;
        cuadrado=Math.pow(suma, 2);
        System.out.println("El cuadrado de la suma es: "+cuadrado);
    }

}
