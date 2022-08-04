/*
 * Ejercicio A-02:
 * Hacer un programa que calcule e imprima el salario semanal de un empleado
 * a partir de sus horas semanales trabajadas y de su salario por hora.
 */

import java.util.Scanner;
public class EjercicioA02 {

    public static void main(String[] args) {
        System.out.print("Horas trabajadas esta semana: ");
        Scanner scc = new Scanner(System.in);
        float horas= scc.nextFloat();
        System.out.print("Salario por hora: ");
        float salario=scc.nextFloat();
        float toto=salario*horas;
        System.out.println("\nSu salario semanal es: "+toto);
    }
    
}
