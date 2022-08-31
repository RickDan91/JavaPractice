/*
 * Ejercicio C-18:
 * Modificaciones al Ejercicio C-19: No se introduce precio por litro, solo existen tres opciones:
 * 1-9.6  2-3  3-1.25
 */
import java.util.Scanner;

public class EjercicioC18 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Scanner mscn= new Scanner(System.in);
        int conti,menu; conti=0;
        float precio,total,litro,litraje; litraje=0; total=0;

        System.out.println("Tabla de precios: \n1_9.6[$/l]\n2_3[$/l]\n3_1.25[$/l]");

        for (int i = 0; i < 5; i++) {
            System.out.println("FACTURA "+(i+1));
            System.out.print("Cantidad de litros: ");
            litro=scn.nextFloat();
            precio=0; menu=0;
            System.out.print("Precio por litro, OPCION: ");
            menu=mscn.nextInt();
            if(menu==1) precio=9.6f;
            else if(menu==2) precio=3;
            else if(menu==3) precio=1.25f;
            total+=precio*litro;
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
