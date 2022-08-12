/*
 * Ejercicio B-5:
 * Un obrero necesita calcular su salario semanal, el cual
 * se obtiene de la siguiente manera:
 * -Si trabaja 40 horas o menos se le paga $16 por hora
 * -Si trabaja mas de 40 horas se le paga $16 por cada
 * una de las primeras 40 horas y $20 por cada hora extra.
 */
import java.util.Scanner;

 public class EjercicioB05 {
    public static void main(String[] args){
        int horas, salario;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas esta semana: ");
        horas=scn.nextInt();
        if(horas<=40) salario=horas*16;
        else salario=(horas*16)+20*(horas-40);
        System.out.print("Su salario sera de: "+salario+"\n");
    }
}
