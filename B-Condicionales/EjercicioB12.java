/*
 * Ejercicio B-12:
 * Pedir una nota de 0 a 10 y mostrarla de la forma:
 * Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */
import java.util.Scanner;

public class EjercicioB12 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int nota;
        System.out.print("Introduzca su nota: ");
        nota=scn.nextInt();
        System.out.print("\nResultado: -");
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3: System.out.println("Insuficiente"); break;
            case 4:
            case 5: System.out.println("Suficiente"); break;
            case 6:
            case 7: System.out.println("Bien"); break;
            case 8:
            case 9: System.out.println("Notable"); break;
            case 10: System.out.println("Sobresaliente"); break;
            default: System.out.println("Su nota debe estar entre 0 y 10"); break;
        }
    }
}
