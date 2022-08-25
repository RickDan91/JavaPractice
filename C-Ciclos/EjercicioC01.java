/*
 * Eercicio C-1:
 * Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
 * numero negativo.
 */
import java.util.Scanner;

public class EjercicioC01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero no negativo: ");
        numero=scn.nextInt();
        
        while(numero>=0){
            System.out.println("\nEl cuadrado de "+numero+" es: "+((int)Math.pow(numero, 2)));
            System.out.print("Ingrese un numero no negativo: ");
            numero=scn.nextInt();
        }
    }
}
