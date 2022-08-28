/*
 * Ejercicio C-8:
 * Pedir un numero N, y mostrar todos los numeros del 1 al N.
 */
import java.util.Scanner;

public class EjercicioC08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n;

        System.out.print("Introduzca un numero N: ");
        n=scn.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print((i+1)+" ");
        }
        
        System.out.println();
    }
}
