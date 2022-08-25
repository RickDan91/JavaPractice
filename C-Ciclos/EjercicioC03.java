/*
 * Ejercicio C-3:
 * Leer numeros hasta que se introduzca un 0(cero).
 * Para cada uno indicar si es par o impar.
 */
import java.util.Scanner;

public class EjercicioC03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un numero: ");
        numero=scn.nextInt();

        while(numero!=0){
            if (numero%2==0) System.out.println("Su numero es PAR.");
            else System.out.println("Su numero es IMPAR");

            System.out.print("\nIntroduzca un numero: ");
            numero=scn.nextInt();
        }
        System.out.println("Su numero es 0(CERO). ADIOS!!");
    }
}
