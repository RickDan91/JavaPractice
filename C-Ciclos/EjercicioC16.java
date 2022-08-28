/*
 * Ejercicio C-16:
 * Pide un numero entre 0 y 10, y mostrar la tabla de
 * multiplicar de dicho numero.
 */
import java.util.Scanner;

public class EjercicioC16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero entre 0 y 10: ");
        num=scn.nextInt();
        System.out.println("Tabla del "+num+":");

        for (int i=0; i<=10; i++) {
            System.out.print(i+" x "+num+" = "+(num*i)+"\n");
        }
    }
}
