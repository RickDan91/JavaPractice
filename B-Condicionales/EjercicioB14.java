/*
 * Ejercicio B-14:
 * Hacer un programa que pase de [kg] a otra unidad de medida de masa,
 * mostrar en pantalla un menu de opciones posibles.
 */

 import java.util.Scanner;

public class EjercicioB14 {
    public static void main(String[] args) {
        Scanner scnmenu=new Scanner(System.in);
        Scanner scnmasa=new Scanner(System.in);
        int menu;
        float masa;

        System.out.print("Ingrese masa en [kg]: "); 
        masa=scnmasa.nextFloat();
        System.out.print("\n~MENU~"+
        "\n(1) [g]"+
        "\n(2) [Lb]"+
        "\n(3) [t]"+
        "\n(4) [mg]"+
        "\n\n(0) SALIR"+
        "\nopcion: ");
        menu=scnmenu.nextInt();
        switch(menu){
            case 1: masa*=1000; System.out.println("Tiene "+masa+"[g]"); break;
            case 2: masa*=2.20462; System.out.println("Tiene "+masa+"[Lb]"); break;
            case 3: masa/=1000; System.out.println("Tiene "+masa+"[t]"); break;
            case 4: masa*=1000000; System.out.println("Tiene "+masa+"[mg]"); break;
            case 0: break;
            default: System.out.println("Ingrese un valor correcto."); main(args); break;
        }
    }
}
