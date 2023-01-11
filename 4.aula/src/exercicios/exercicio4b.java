package exercicios;

import java.util.Scanner;

public class exercicio4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Par ou Impar? ");
        int num = input.nextInt();
        num = num % 2;
        if (num == 0){
            System.out.println("Número é par");
        }
        else{
            System.out.println("Número é ímpar");
        }
    }
}
