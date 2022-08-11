/*
 * Ejercicio B-03:
 * Hacer un programa que lea un caracter por teclado y compruebe si es una letra
 * mayuscula.
 */

import java.util.Scanner;

public class EjercicioB03 {
    public static void main(String[] args) {
        char dato;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        dato=scn.next().charAt(0);
        if(Character.isUpperCase(dato)) System.out.print(dato + " es mayuscula.\n");
        else System.out.print(dato + " es minuscula.\n");
    }
}
