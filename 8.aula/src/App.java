import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*int num = 1;
        do {
            System.out.println(num);
            ++num;
        } while (num <= 10);*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionários: ");
        int func = input.nextInt();
        int aux = 1;
        double soma = 0;
        while (aux <= func){
            System.out.printf("Salário do funcionario %d: ", aux);
            double salario = input.nextDouble();
            soma = soma + salario;
            ++aux;
        }
        System.out.printf("A soma dos salários dos funcionários é: R$ %.2f ", soma);

    }
}
