/*
 * Ejercicio B-07:
 * Pedir tres numeros y mostrarlos ordenados de mayor a
 * menor.
 */
import java.util.Scanner;
public class EjercicioB07 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese tres numeros: ");
        num1=scn.nextInt(); num2=scn.nextInt(); num3=scn.nextInt();
        if(num1>num2 && num1>num3) {
            if(num2>num3) System.out.println(num1+" "+num2+" "+num3);
            else System.out.println(num1+" "+num3+" "+num2);
        }else
        if (num2>num1 && num2>num3){
            if(num1>num3) System.out.println(num2+" "+num1+" "+num3);
            else System.out.println(num2+" "+num3+" "+num1);
        }else
        if (num3>num1 && num3>num2){
            if(num1>num2) System.out.println(num3+" "+num1+" "+num2);
            else System.out.println(num3+" "+num2+" "+num1);
        }
    }
}
