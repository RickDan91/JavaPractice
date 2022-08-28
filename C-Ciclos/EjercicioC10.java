/*
 * Ejercicio C-10:
 * Pedir 10 numeros y escribir la suma total.
 */
import java.util.Scanner;

public class EjercicioC10 {
    public static void main(String[] args) {
        int num,suma;
        suma=0;
        Scanner scn=new Scanner(System.in);

        System.out.println("Escriba 10 numeros:");

        for (int i=0; i<10; i++) {
            System.out.print("Numero "+(i+1)+": ");
            num=scn.nextInt();
            suma+=num;
        }

        System.out.println("La suma es: "+suma);
    }
}
