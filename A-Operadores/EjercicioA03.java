/*
 * Ejercicio A-03:

 * Guillermo tiene N dolares. Luis tiene la mitad de lo que tiene Guillermo.

 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.

 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen

 * entre los tres.

 */

import java.util.Scanner;



public class EjercicioA03 {



    public static void main(String[] args) {

        float dGui, dLui, dJua, suma;

        Scanner scn=new Scanner(System.in);

        System.out.print("Cuanto dinero tiene Guillermo?: ");

        dGui=scn.nextFloat();

        dLui=dGui/2;

        dJua=(dGui+dLui)/2;

        suma=dGui+dLui+dJua;

        System.out.print("\nEntonces Guillermo tiene "+dGui+" dolares, ");

        System.out.println("Luis tiene "+dLui+" dolares y");

        System.out.println("Juan tiene "+dJua+" dolares.");

        System.out.println("Entre los tres tienen $"+suma+".");

    }



}
