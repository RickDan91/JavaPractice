/*
 * Ejercicio D-8:
 * Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer
 * mediante el teclado 8 numeros. Despues se debe pedir un numero y una posicion,
 * insertarlo en la posicion indicada, desplazando los que esten detras.
*/
import java.util.Scanner;

public class EjercicioD08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Scanner scp=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);
        int[] tabla=new int[10];
        int numi,pos;

        for(int i=0;i<8;i++){
            System.out.print("Escriba un numero: ");
            tabla[i]=scn.nextInt();
        }

        for(int i=0;i<8;i++){
            if(i==0) System.out.print("{ "+tabla[i]);
            else if(i<7) System.out.print(" , "+tabla[i]);
            else if(i==7) System.out.print(" , "+tabla[i]+" ,    ,    }");
        }System.out.println();
        
        System.out.print("Escriba un numero y una posicion:\nNumero: ");
        numi=sca.nextInt();
        System.out.print("Posicion: ");
        pos=scp.nextInt();

        for(int j=8;j>pos;j--){
            tabla[j]=tabla[j-1];
        }tabla[pos]=numi;

        System.out.println();
        for(int k=0;k<9;k++){
            if(k==0) System.out.print("{ "+tabla[k]);
            else if(k<8) System.out.print(" - "+tabla[k]);
            else if(k==8) System.out.print(" - "+tabla[k]+" -    }");
        }
        System.out.println();
    }
}
