/*
 * Ejercicio B-11:
 * Construir un programa que simule el funcionamiento de una calculadora que puede
 * realizar las cuatro operaciones aritmeticas basicas (suma, resta, producto y division)
 * con valores numericos enteros. El usuario debe especificar la operacion con el primer
 * caracter del primer parametro de la linea de comandos: s-S para suma, r-R para resta,
 * p-P para producto y d-D para division.
 */

import java.util.Scanner;

public class EjercicioB11 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Scanner menusc=new Scanner(System.in);
        int num1,num2,resu;
        char menu;

        System.out.print("Ingrese los numeros a operar: "); num1=scn.nextInt(); num2=scn.nextInt();
        System.out.print("Elige la operacion a realizar:"+
        "\nS - Suma \nR - Resta \nP - Producto \nD - Division\n");
        menu=menusc.nextLine().charAt(0);
        switch(menu){
            case 's':
            case 'S': resu=num1+num2; System.out.println("Resultado: "+resu); break;
            case 'r':
            case 'R': resu=num1-num2; System.out.println("Resultado: "+resu); break;
            case 'p':
            case 'P': resu=num1*num2; System.out.println("Resultado: "+resu); break;
            case 'd':
            case 'D': resu=num1/num2; System.out.println("Resultado: "+resu); break;
            default: break;
        }

    }
}
