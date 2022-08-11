/*
 * Ejercicio A-07:
 * Construir un programa que, dado un numero de horas, devuelve el numero de
 * semanas, dias y horas equivalentes. 
 */

import java.util.Scanner;

public class EjercicioA07 {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int dato, hora, dia, semana;
        System.out.print("Ingrese la cantidad de horas: ");
        dato= scn.nextInt();
        hora=dato%24; 
        dia=(dato/24)%7;
        semana=(dato/(24*7));
        System.out.println("Semanas: "+semana+"\nDias: "+dia+"\nHoras: "+hora);
    }
}
