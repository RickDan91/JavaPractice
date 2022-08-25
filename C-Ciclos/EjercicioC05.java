/*
 * Ejercicio C-5:
 * Realizar un juego para adivinar un numero entre 0 y 100. Luego ir pidiendo numeros
 * indicando si el numero N es mayor o menor. El proceso termina cuando el usuario acierta
 * y mostrar el numero de intentos.
 */
import java.util.Scanner;

public class EjercicioC05 {
    public static void main(String[] args) {
        int intento,num;
        double n;
        Scanner scn=new Scanner(System.in);
        n=(int)(Math.random()*100);
        System.out.print("JUEGO: Adivine el numero entre 0 y 100."+
        "\nIntroduzca un numero: "); num=scn.nextInt(); intento=1;

        while(num!=n){
            if(n>num) System.out.print("\nEl numero N es mayor.");
            else System.out.print("\nEl numero N es menor.");

            System.out.print("Intente nuevamente: ");
            intento++;
            num=scn.nextInt();
        }

        System.out.println("Ha acertado!! Felicidades!"+
        "\nNumero de intentos: "+intento); 
    }
}
