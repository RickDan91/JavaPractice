/*
 * Ejercicio C-15:
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la
 * altura media, la cantidad de alumnos mayores de 18 años, y la
 * cantidad de alumnos que miden mas de 1,75 mts.
 */
import java.util.Scanner;

public class EjercicioC15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int edad,ied,ial; ial=0; ied=0;
        float altura,sed,sal; sal=0; sed=0;

        System.out.println("_-REGISTRO DE ALUMNOS-_");
        
        for (int i=0; i<5; i++) {
            System.out.print("Alumno "+(i+1)+"\nAltura: ");
            altura=scn.nextFloat(); sal+=altura; if(altura>1.75) ial++;
            System.out.print("Edad: ");
            edad=scn.nextInt(); sed+=edad; if(edad>18) ied++;
            System.out.println();
        }

        System.out.print("Media de edades:"+(sed/5));
        System.out.print("\nMedia de alturas: "+(sal/5));
        System.out.print("\nAlumnos mayores de 18: "+ied);
        System.out.print("\nAlumnos altos: "+ial);
        System.out.println();
    }
}
