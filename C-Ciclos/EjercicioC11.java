/*
 * Ejercicio C-11:
 * Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
 */

public class EjercicioC11 {
    public static void main(String[] args) {
        int numero,producto;
        producto=1;

        for (int i=0; i<10; i++) {
            numero=(2*(i+1))-1;
            producto*=numero;
            System.out.print(" "+numero);
        }

        System.out.println("\n"+producto);
    }
}
