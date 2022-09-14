/*
 * Ejercicio D-7:
 * Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos
 * si los numeros estan ordenados de forma creciente, decreciente, o si estan 
 * desordenados.
 */
import java.util.Scanner;

public class EjercicioD07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        boolean ordenD, ordenC; ordenC=true; ordenD=true;
        int[] numes=new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Digite un numero: ");
            numes[i]=scn.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if(numes[i]<numes[i+1]) ordenD=false;
            if(numes[i]>numes[i+1]) ordenC=false;
        }

        for(int i=0;i<10;i++){
            if(i==0) System.out.print("Numeros: { ");
            System.out.print(numes[i]+" ");
            if(i==9) System.out.print("}");
        }
        
        System.out.println();

        if(ordenD==true) System.out.println("Los numeros estan ordenados de manera Decreciente.");
        else if(ordenC==true) System.out.println("Los numeros estan ordenados de manera Creciente.");
        else System.out.println("los numeros no estan ordenados.");
    }
}
