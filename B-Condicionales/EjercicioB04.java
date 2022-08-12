/*
 * Ejercicio B-4:
 * En MegaPlaza se hace un 20% de descuento a los clientes
 * cuya compra supere los $300. Cual sera la cantidad que 
 * pagara una persona por su compra?
 */
import java.util.Scanner;

 public class EjercicioB04{
    public static void main(String [] args){
        float valorCompra;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ingrese el valor de su compra: ");
        valorCompra=scn.nextFloat();
        if(valorCompra>300) valorCompra *=0.8;
        System.out.print("\nUsted pagara: " + valorCompra + "\n");
    }
 }