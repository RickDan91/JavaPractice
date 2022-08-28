/*
 * Ejercicio C-14:
 * Pedir 10 sueldos. Mostrar la suma y cuantos hay mayores de $1000.
 */
import java.util.Scanner;

public class EjercicioC14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float sueldo,suma; suma=0;
        int mayo; mayo=0;

        for (int i=0; i<10; i++) {
            System.out.print("Ingrese un sueldo en U$D: "); sueldo=scn.nextInt();
            suma+=sueldo;
            if(sueldo>1000) mayo++;
        }

        System.out.print("\nLa suma de sus sueldos es: "+suma);
        if(mayo>1)System.out.print("\n"+mayo+" sueldos son mayores a U$D 1000.");
        else if(mayo==1) System.out.println("\nUn sueldo suyo es mayor a U$D 1000");
        else if(mayo==0) System.out.println("\nNinguno de sus sueldos supera los U$D 1000.");
        System.out.println();
    }
}
