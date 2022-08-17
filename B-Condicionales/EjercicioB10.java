/*
 * Ejercicio B-10:
 * Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
 * Con meses de 28, 30  31 dias. Sin años bisiestos.
 */
import java.util.Scanner;

public class EjercicioB10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int dia,mes,año;
        System.out.print("Ingrese dia: "); dia=scn.nextInt();
        System.out.print("Ingrese mes: "); mes=scn.nextInt();
        System.out.print("Ingrese año: "); año=scn.nextInt();
        if(año==0) System.out.print("Fecha incorrecta");
        else if(mes==2 && dia>=1 && dia<=28) System.out.print("Fecha correcta");
        else if(mes==4 || mes==6 || mes==9 || mes==11 && dia>=1 && dia<=30)
        System.out.println("Fecha correcta");
        else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 && dia>=1 && dia<=31)
        System.out.println("Fecha correcta");
        else System.out.println("Fecha Incorrecta");
    }
}
