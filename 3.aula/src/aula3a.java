import java.util.Scanner;

public class aula3a {
    /*Faça um programa em que o usuário digita as duas notas de um 
        aluno e mostra se o aluno foi a */
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua nota1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite sua nota2: ");
        double n2 = entrada.nextDouble();

        double media = (n1 + n2) / 2;
        if (media >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
            System.out.println("Você irá fazer a prova final");
        }

    }
}
