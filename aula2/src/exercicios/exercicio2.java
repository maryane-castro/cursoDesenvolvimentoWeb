package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        /*Escreva um porgrama que faz o aumetno do salário em 10% */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = entrada.nextDouble();
        double aumento = salario * 0.1;
        double novoSalario = salario + aumento;
        
        System.out.printf("Novo salário é de: %.2f e o valor do aumento é %f%n", novoSalario, aumento);
    }
}
