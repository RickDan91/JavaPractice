/*
 * Ejercicio C-21:
 * Pedir 10 numeros y mostrar al final si se introdujo algun negativo.
 */
import java.util.Scanner;

public class EjercicioC21 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numero, nego; nego=0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numero=scn.nextInt();
            if(numero<0) nego++;
        }

        if(nego==0) System.out.println("No se ingresaron numeros negativos.");
        else if(nego==1) System.out.println("Se ingreso un solo numero negativo.");
        else if(nego>1) System.out.println("Se ingresaron "+nego+" numeros negativos");
    }
}
