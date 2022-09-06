/*
 * Ejercicio D-3:
 * Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar
 * la media de los numeros positivos, la media de los negativos y contar el numero
 * de ceros.
 */
import java.util.Scanner;

public class EjercicioD03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float[] numa=new float[5];
        float sumo,sumi; sumo=0; sumi=0;
        int pos=0,neg=0,cer=0;

        for(int i=0;i<5;i++){
            System.out.print("Introduzca valor: ");
            numa[i]=scn.nextFloat();
            if(numa[i]<0) {sumi+=numa[i]; neg++;}
            else if(numa[i]==0) cer++;
            else{sumo+=numa[i]; pos++;}
        }

        if(neg>0)System.out.print("La media de negativos es: "+(sumi/(float)neg)+"\n");
        else System.out.println("No hay numeros negativos");

        if(pos>0)System.out.print("La media de positivos es: "+(sumo/(float)pos)+"\n");
        else System.out.println("No hay numeros positivos");
        
        if(neg>0)System.out.print("La cantidad de ceros es: "+cer+"\n");
        else System.out.println("No hay ceros");

    }
}
