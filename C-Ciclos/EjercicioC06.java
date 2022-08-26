/**
 * Ejercicio C-6:
 * Pedir numeros hasta que se teclee un 0(cero), mostrar la suma
 * de todos los numeros introducidos.
 */
import java.util.Scanner;

public class EjercicioC06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num,suma; suma=0;

        System.out.print("__SUMA__"+
        "\nIngrese un numero distinto de 0(CERO): ");
        num=scn.nextInt();

        while(num!=0){
            suma+=num;
            System.out.print("\nIngrese 0(CERO) para terminar u otro numero a sumar"+
            "\n-Ingrese otro numero: ");
            num=scn.nextInt();
        }

        System.out.println("La suma de sus numeros es: "+suma);
    }
}