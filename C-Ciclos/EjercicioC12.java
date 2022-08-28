/*
 * Ejercicio C12:
 * Pedir un numero y calcular su factorial.
 */
import java.util.Scanner;

public class EjercicioC12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int fac,num;
        fac=1;
        
        System.out.print("Ingrese un numero: ");
        num=scn.nextInt();

        for (int i=num; i>0; i--) {
            fac*=i;
        }

        System.out.print(num+"! = "+fac);
        System.out.println();
    }
}
