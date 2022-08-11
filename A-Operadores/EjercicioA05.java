/*
 * Ejercicio A-05:
 * La calificacion final de un estudiante de informatica se calcula con base a
 * las calificaciones de cuatro aspectos de su rendimiento academico: participacion,
 * primer examen parcial, segundo examen parcial y examen final. Sabiendo que las
 * calificaciones anteriores entran a la calificacion final con ponderadores del
 * 10%, 25%, 25% y 40%.
 * Hacer un programa que calcule e imprima la calificacion final obtenida por el estuduante.
 */

import java.util.Scanner;

public class EjercicioA05 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float par1, par2, exaf, part, toto;
        System.out.println("Ingrese las calificaciones por:");
        System.out.print("Participacion: ");
        part=scn.nextFloat();
        System.out.print("Primer Parcial: ");
        par1=scn.nextFloat();
        System.out.print("Segundo Parcial: ");
        par2=scn.nextFloat();
        System.out.print("Examen Final: ");
        exaf=scn.nextFloat();
        toto=(0.1f*part)+(0.25f*par1)+(0.25f*par2)+(0.4f*exaf);
        System.out.println("\nSu nota final es: "+toto);
        if(toto>4) System.out.println("Estas aprobado. FELICIDADES!!");
        else System.out.println("Lo sentimos, reprobaste");
    }

}
