/*
 * Ejercicio D-1:
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el
 * orden introducido.
 */
import java.util.Scanner;

public class EjercicioD01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float numer[]=new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"_Numero: ");
            numer[i]=scn.nextFloat();
        }

        System.out.println("El arreglo es:");

        System.out.print("[ ");
        for (float f : numer) {
            System.out.print(f+" ");
        }
        System.out.print("]\n");
    }
}
