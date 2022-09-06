/*
 * Ejercicio D-4:
 * Leer 10 numeros enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: el primero, el ultimo,
 * el segundo, el penultimo, el tercero, etc.
 */
import java.util.Scanner;

public class EjercicioD04 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numa[]=new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Introduzca un numero: ");
            numa[i]=(int)scn.nextInt();
        }

        for(int i=0;i<5;i++){
                System.out.print(numa[i]+" "+numa[9-i]+" ");
        }
    }
}
