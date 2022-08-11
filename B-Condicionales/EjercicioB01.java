/*
 * Ejercicio B-01:
 * Hacer un programa que lea un numero entero y muestre si el numero es multiplo
 * de 10.
 */

import java.util.Scanner;

public class EjercicioB01 {
    public static void main(String[] args) {
        int dato;
        Scanner scn =new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        dato=scn.nextInt();
        if (dato%10==0) System.out.println("\nEl numero es multiplo de 10.");
        else System.out.println("\nEl numero no es multiplo de 10");
    }
}
