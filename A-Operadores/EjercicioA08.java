/*
 * Ejercicio A-08:
 * Construir un programa que calcule y muestre por pantalla las raices de la ecuacion
 * de segundo grado de coeficientes reales.
 */

 import java.util.Scanner;

public class EjercicioA08 {
    public static void main(String[] args) {
        double a,b,c,r1,r2;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ingrese los parametros:"+"\na: ");
        a=scn.nextDouble();
        System.out.print("b: ");
        b=scn.nextDouble();
        System.out.print("c: ");
        c=scn.nextDouble();
        if(Math.pow(b, 2)-(4*a*c)<0) System.out.println("ERROR! Las raices no son reales");
        else{
            r1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            r2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            System.out.println("Las raices son:"+"\nRaiz 1= "+r1+"\nRaiz 2= "+r2);
        }
    }
}
