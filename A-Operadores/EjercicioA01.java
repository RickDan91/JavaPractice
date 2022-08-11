/*
 * Ejercicio A-01:
 * Hacer un programa que calcule e imprima la suma de tres calificaciones
 */

import java.util.Scanner;

public class EjercicioA01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float nota1, nota2, nota3;
        System.out.println("A continuacion ingrese tres notas: ");
        nota1=scn.nextFloat();
        nota2=scn.nextFloat();
        nota3=scn.nextFloat();
        float suma=nota1+nota2+nota3;
        System.out.println("La suma de sus calificaciones es: "+suma);
        float promedio=suma/3;
        System.out.println("Su promedio es: "+promedio);
        if (promedio<6) System.out.println("Estas desaprobado, lo sentimos");
        else System.out.println("Estas aprobado, FELICIDADES!!");
    }
    
}
