package exercicios;

import java.util.Scanner;

public class exercicio4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        
        System.out.print("Digite um número para saber o módulo: ");
        num = input.nextInt();

        if (num < 0){
            num = num - (2 * num);
            System.out.printf("O módulo é: %d", num);
        }
        else{
            System.out.printf("O modulo é: %d", num);
        }
    }
}
