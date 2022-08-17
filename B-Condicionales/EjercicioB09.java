/*
 * Ejercicio B-09:
 * Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
 * Suponer los meses de 30 dias.
 */
import java.util.Scanner;

public class EjercicioB09 {
    public static void main(String[] args){
        int dia, mes, año;
        Scanner scn=new Scanner(System.in);
        System.out.println("Ingresar Fecha con numeros");
        System.out.print("Ingrese dia: "); dia=scn.nextInt();
        System.out.print("Ingrese mes: "); mes=scn.nextInt();
        System.out.print("Ingrese año: "); año=scn.nextInt();
        if(dia>0 && dia<31) {
            if(mes>0 && mes<13) {
                if(año!=0) System.out.println("\nFecha: "+dia+"/"+mes+"/"+año);
                else System.out.println("ERROR! La fecha es incorrecta!");
            }else System.out.println("ERROR! La fecha es incorrecta!");
        }else System.out.println("ERROR! La fecha es incorrecta!");
    }
}
