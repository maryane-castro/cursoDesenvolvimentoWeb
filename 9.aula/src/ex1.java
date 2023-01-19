import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int quantidade = 0;
        int num = 0;
        int soma = 0;
        int contaPares = 0;
        while (num != -1){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um número para dizer se é par ou não: ");
            num = input.nextInt();
            if (num > -1){
            
                if (num % 2 == 0){
                    soma = soma + num;
                    System.out.println("É PAR");
                    ++contaPares;
                } else {
                    System.out.println("Não é par, não houve soma.");
                }
            } else {
                System.out.println("É número negativo!! ");
            }
        }

        
        System.out.printf("A soma dos pares é %d, e a quantidade de pares escritos foram %d", soma, contaPares );
    }
}
