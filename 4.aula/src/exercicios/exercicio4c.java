package exercicios;

import java.util.Scanner;

public class exercicio4c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double salario = input.nextDouble();
        System.out.println("Valor total de vendas: ");
        double vendas = input.nextDouble();
        if (salario < 1500 && vendas > 2000){
            salario = salario * 1.1;
            System.out.printf("Seu salário teve aumento: %f", salario);
        }else{
            System.out.println("Não teve aumento de salário.");
        }
    }
}
