package exercicios;

import java.util.Scanner;

public class ex5a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cons5a conta = new cons5a("Uupe", 3);

        System.out.print("Deposito: ");
        conta.setSaldo(input.nextDouble());   //recebe valor do deposito
        conta.Saldo(3);
        System.out.println(conta.getSaldo()); //retorna saldo
        
    }
}


