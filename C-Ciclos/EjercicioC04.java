/*
 * Ejercicio C-4:
 * Pedir numeros hasta que se teclee uno negativo, y mostrar
 * cuantos numeros se han introducido.
 */
import java.util.Scanner;

public class EjercicioC04 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numero,i; i=1;

        System.out.print("Introduzca un numero: ");
        numero=scn.nextInt();

        while(numero>=0){
            i++;
            System.out.print("Introduzca un numero: ");
            numero=scn.nextInt();
        }

        System.out.println("Ha introdicido "+i+" numeros.");
    }
}
