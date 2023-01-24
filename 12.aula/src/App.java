import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int quantidadedeNotas = 0;
        

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = input.nextInt();

        GradeBook cursoJava = new GradeBook(quantidadeNotas);

    }
}
