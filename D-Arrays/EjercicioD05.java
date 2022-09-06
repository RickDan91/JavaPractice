/*
 * Ejercicio D-5:
 * Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la
 * forma: 1a, 1b, 2a, 2b, etc.
 */
import java.util.Scanner;

public class EjercicioD05 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] tablaA,tablaB; tablaA=new int[10]; tablaB=new int[10];
        
        System.out.println("Tabla A");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". ");
            tablaA[i]=scn.nextInt();
        }

        System.out.println();
        System.out.println("Tabla B");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". ");
            tablaB[i]=scn.nextInt();
        }

        System.out.println();
        System.out.println("Tabla C");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+"-\tA. "+tablaA[i]+"\tB. "+tablaB[i]+"\n");
        }
    }
}
