/*
 * Ejercicio B-13:
 * Hacer un programa que simule un cajero automatico con un saldo inicial de
 * 1000, con el siguiente menu de opciones:
 * 1- Ingresar dinero
 * 2- Retirar dinero
 * 0- Salir
 */

import java.util.Scanner;

public class EjercicioB13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Scanner scn2=new Scanner(System.in);
        int opci, dinero; int saldo=1000;
        
        System.out.print("BIENVENIDO"+"\n\n"+
        "Saldo: "+saldo+
        "\n1- Ingresar dinero"+
        "\n2- Retirar dinero"+
        "\n0- Salir"+
        "\n\nSeleccione una opcion: ");

        opci=scn.nextInt();
        switch(opci){
            case 1:
                System.out.print("Ingrese monto: ");
                dinero=scn.nextInt();
                System.out.println("__Su SALDO es: "+(saldo+dinero));
                scn2.nextLine();
                main(args);
                break;
            case 2:
                System.out.print("Ingrese monto: "); dinero=scn.nextInt();
                if (dinero>1000) {
                    System.out.println("Saldo insuficiente");
                    scn2.nextLine();
                    main(args); break;
            }
                else {
                    System.out.println("__Su SALDO es: "+(saldo-dinero));
                    scn2.nextLine(); main(args); break;
                }
            case 0: break;
            default: main(args); break;
        }//scn.close(); scn2.close(); //Cierre de Scanners
    }
}
