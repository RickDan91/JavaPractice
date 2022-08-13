/*
 * Ejercicio B-08:
 * Pedir un numero entre 0 y 99.999 y decir cuantas cifras
 * tiene.
 */
import java.util.Scanner;

public class EjercicioB08 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero:");
        numero=scn.nextInt();
        if(numero<10) System.out.println("El numero tiene 1 cifra");
        else if(numero<100) System.out.println("El numero tiene 2 cifras");
        else if(numero<1000) System.out.println("El numero tiene 3 cifras");
        else if(numero<10000) System.out.println("El numero tiene 4 cifras");
        else if(numero<100000) System.out.println("El numero tiene 5 cifras");
        else System.out.println("El numero tiene mas de 5 cifras");
    }
}
