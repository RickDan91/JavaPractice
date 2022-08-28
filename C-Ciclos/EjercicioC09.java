/*
 * Ejercicio C-9:
 * Escribir todos los numeros del 100 al 0 de a 7.
 */

public class EjercicioC09 {
    public static void main(String[] args) {
        for (int i=100; i>0; i-=7) {
            System.out.print(" "+i);
            System.out.println();
        }
    }
}
