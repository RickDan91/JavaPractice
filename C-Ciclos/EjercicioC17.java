/*
 * Ejercicio C-17:
 * Una empresa que se dedica a vender desinfectantes necesita un programa para gestionar las facturas.
 * En cada una figura: el codigo del articulo, la cantidad vendida en litros y el precio por litro.
 * Se pide de 5 facturas introducidas: Facturacion total, cantidad de litros vendidos del articulo 1
 * y cuantas facturas se emitieon de mas de $800.
 */
import java.util.Scanner;

public class EjercicioC17 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Scanner sco= new Scanner(System.in);
        int conti,litro,total,litraje; conti=0; total=0; litraje=0;
        float precio;

        for (int i = 0; i < 5; i++) {
            System.out.println("FACTURA "+(i+1));
            System.out.print("Cantidad de litros: ");
            litro=scn.nextInt();
            System.out.print("Precio por litro:");
            precio=sco.nextFloat();
            total+=(precio*litro);
            litraje+=litro;
            System.out.println();
            if(litro*precio>800) conti++;
        }

        System.out.println("\nFacturacion total: "+total);
        System.out.println("Cantidad de litros vendidos: "+litraje);
        if(conti>0) System.out.println("Facturas de mas de $800: "+conti);
        else System.out.println("No se emitieron facturas de mas de $800.");
    }
}
