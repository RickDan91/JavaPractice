/*
 * Ejercicio C-20:
 * Pedir un numero N, introducir N sueldos y mostrar el sueldo maximo.
 */
import java.util.Scanner;

public class EjercicioC20 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Scanner sld=new Scanner(System.in);
        int n;
        float sueldo,max; max=0;

        System.out.print("Introduzca la cantidad de sueldos a evaluar: ");
        n=scn.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Sueldo "+(i+1)+": $");
            sueldo=sld.nextFloat();
            if(sueldo>max) max=sueldo;
        }

        System.out.println("\nSueldo maximo: $"+max);
    }
}
