import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)  {
        int num = 1;
        do {
            System.out.println(num);
            ++num;
        } while (num <= 10);
        
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
        System.out.printf("A soma dos salários dos funcionários é: R$ %.2f %nA média salárial é: %.2f ", soma, (soma/func));

        int i;
        for (i = 0; i <= 10; i++){
            System.out.println(i);
        }
        

        Scanner input = new Scanner(System.in);
        

        System.out.print("Quantidade de vendedores: ");
        int funcionario = input.nextInt();
        while (funcionario < 1){
            System.out.print("Digite um número válido:");
            funcionario = input.nextInt();
        }
        int aux = 1;
        double media = 0;
        
        double melhorVenda = -1;
        int melhorvendedor = -1;
        while (aux <= funcionario){
            System.out.printf("Valor das vendas do funcionario %d: ", aux);
            double vendas = input.nextDouble();

            System.out.printf("O valor de vendas do vendedor %d foi: %.2f%n", aux, vendas);
            media = media + vendas;
            
            if (aux == 1){
               melhorVenda = vendas;
               melhorvendedor = aux;
            } else if(melhorVenda < vendas){
                melhorVenda = vendas;
                melhorvendedor = aux;
            }
            ++aux;
        }
        



        System.out.printf("%nMédia do valor de vendas foi: %.2f%n%n", media);
        System.out.print(melhorvendedor);

        while (true) {
            System.out.println("ok");
        }
        
        
        

    }
}
