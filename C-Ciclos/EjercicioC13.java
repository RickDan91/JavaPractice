/*
 * Ejercicio C-13:
 * Pedir 10 numeros. Mostrar la media de los numeros positivos, la
 * media de los numeros negativos y la cantidad de ceros.
 */
import java.util.Scanner;

public class EjercicioC13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num,negi,posi,neg,pos,ceros;
        float mpos, mneg;
        posi=0; negi=0; neg=0; pos=0; ceros=0;

        for (int i=0; i<10; i++) {
            System.out.print("Ingrese numero: "); num=scn.nextInt();
            if(num<0) {
                negi++; neg+=num;
            }
            else if(num>0){
                posi++; pos+=num;
            }
            else ceros++;
        }

        mneg=(float)neg/(float)negi;
        mpos=(float)pos/(float)posi;

        if(negi>0) System.out.print("La media de negativos es: "+mneg);
        else System.out.print("La media de negativos es 0(CERO)");

        if(posi>0) System.out.print("\nLa media de positivos es: "+mpos);
        else System.out.print("\nLa media de positivos es 0(CERO)");

        System.out.print("\nLa cantidad de ceros es: "+ceros);
        System.out.println();
    }
}
