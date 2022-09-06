/*
 * Ejercicio D-2:
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en 
 * el orden inverso al introducido.
 */
import java.util.Scanner;

public class EjercicioD02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float numa[]= new float[5];

        for(int i=0;i<5;i++){
            System.out.print("Introduzca un numero: ");
            numa[i]=scn.nextFloat();
        }

        System.out.println();

        for(int i=5;i>0;i--){
            if(i==5) System.out.print("("+numa[i-1]);
            else if(i==1) System.out.print("\t"+numa[i-1]+")");
            else System.out.print("\t"+numa[i-1]);
        }

        System.out.println();
    }
}
