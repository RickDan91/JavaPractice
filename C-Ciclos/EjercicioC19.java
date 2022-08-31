/*
 * Ejercicio C-19:
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionales
 * y suspensos.
 */
import java.util.Scanner;

public class EjercicioC19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float nota;
        int iap,ico,isu; iap=0; ico=0; isu=0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Nota "+(i+1)+": ");
            nota=scn.nextFloat();
            if(nota==4) ico++;
            else if(nota>4) iap++;
            else if(nota<4) isu++;
        }

        System.out.println();
        System.out.println("Aprobados: "+iap);
        System.out.println("Condicionales: "+ico);
        System.out.println("Suspendidos: "+isu);
    }
}
