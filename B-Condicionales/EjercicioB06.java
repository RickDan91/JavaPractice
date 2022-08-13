/*
 * Hacer un programa que tome dos numeros y diga si ambos
 * son pares o impares.
 */
import java.util.Scanner;

public class EjercicioB06{
    public static void main(String[] args){
        int num1,num2;
        Scanner scn=new Scanner(System.in);
        System.out.println("Escriba dos numeros: ");
        num1=scn.nextInt(); num2=scn.nextInt();
        if(num1%2==0 && num2%2==0) System.out.println("\nAmbos son pares");
        else if(num1%2!=0 && num2%2!=0) System.out.println("\nAmbos son impares");
        else System.out.println("\nUn numero es par y el otro impar");
    }
}