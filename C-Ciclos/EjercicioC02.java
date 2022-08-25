/*
 * Ejercicio C-2:
 * Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se
 * introduzca un 0(cero).
 */
import java.util.Scanner;

public class EjercicioC02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un numero: ");
        numero=scn.nextInt();

        while(numero!=0){
            if (numero<0) System.out.println("Su numero es NEGATIVO.");
            else System.out.println("Su numero es POSITIVO");

            System.out.print("\nIntroduzca un numero: ");
            numero=scn.nextInt();
        }
        System.out.println("Su numero es 0(CERO). ADIOS!!");
    }
}
