import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int number1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int number2 = input.nextInt();

        int soma = number1 + number2;
        System.out.printf("Resultado soma %d %n", soma);
    }
}
