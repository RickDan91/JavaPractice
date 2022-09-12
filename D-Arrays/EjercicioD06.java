/*
 * Ejercicio D-6:
 * Leer los datos correspondientes a dos tablas de 12 elementos numericos,
 * y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros
 * 3 de la A, otros 3 de la B, etc.
 */
import java.util.Scanner;

public class EjercicioD06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] tablaA=new int[12];
        int[] tablaB=new int[12];
        int[] tablaC=new int[24];

        for(int i=0;i<12;i++){
            System.out.print("Elemento A"+(i+1)+": ");
            tablaA[i]=scn.nextInt();
            System.out.print("Elemento B"+(i+1)+": ");
            tablaB[i]=scn.nextInt();
        }

        for (int i = 0; i <12; i++) {
            if(i==0) System.out.print("Tabla A: { "+tablaA[i]+" ");
            else if(i<11) System.out.print(tablaA[i]+" ");
            else if(i==11) System.out.print(tablaA[i]+" }\n");
        }

        for (int i = 0; i <12; i++) {
            if(i==0) System.out.print("Tabla B: { "+tablaB[i]+" ");
            else if(i<11) System.out.print(tablaB[i]+" ");
            else if(i==11) System.out.print(tablaB[i]+" }\n");
        }

        for (int i = 0; i < 12; i+=3) {
            if(i==0) System.out.print("Tabla C: { ");
            for (int j = i; j < (i+3) ; j++) {
                System.out.print(tablaA[j]+" ");
            }
            for (int j = i; j < (i+3); j++) {
                System.out.print(tablaB[j]+" ");
            }
            if(i==9) System.out.print("}");
        }
        System.out.println();
    }
}
