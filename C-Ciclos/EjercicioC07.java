/*
 * Ejercicio C-7:
 * Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
 */
import java.util.Scanner;

public class EjercicioC07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int indi,num,suma; suma=0; indi=0;
        float media;

        System.out.print("Ingrese un numero no negativo: ");
        num=scn.nextInt();

        while(num>=0){
            indi++;
            suma+=num;
            System.out.print("\n-Otro numero:");
            num=scn.nextInt();
        }

        media=(float)suma/(float)indi;
        System.out.println("La media de los numeros ingresados es: "+media);
    }
}
