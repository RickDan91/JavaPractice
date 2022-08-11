/*
 * Ejercicio B-02:
 * Pedir 2 numeros y decir cual es mayor o si son iguales. 
 */

import java.util.Scanner;

public class EjercicioB02 {
    public static void main(String[] args) {
        int dato1, dato2;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ingrese dos numeros: ");
        dato1=scn.nextInt(); dato2=scn.nextInt();
        if (dato1>dato2) System.out.println("El primer numero es el mayor");
        else if(dato1<dato2) System.out.println("El segundo numero es el mayor");
        else if (dato1==dato2) System.out.println("Ambos numeros son iguales");
    }
}
