/*
 * Ejercicio C-22:
 * Pedir 5 calificaciones de alumnos y decir al final si hay alguno suspendido.
 */
import java.util.Scanner;

public class EjercicioC22 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float nota;
        int sus; sus=0;

        for (int i= 0; i < 5; i++) {
            System.out.print("Ingrese la calificacion de un alumno: ");
            nota=scn.nextFloat();
            if(nota<4) sus++;
        }

        if(sus==0) System.out.println("No hay alumnos suspendidos.");
        else if(sus==1) System.out.println("Hay un alumno suspendido.");
        else if(sus>1) System.out.println("Hay "+sus+" alumnos suspendidos.");
    }
}
