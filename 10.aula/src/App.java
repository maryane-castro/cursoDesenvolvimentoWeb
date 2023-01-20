import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");   //Pede a quantidade de alunos



        int quantidade = input.nextInt();                           //guarda a quantidade de alunos
        double [] notas = new double[quantidade];
        
        
        for (int alunos = 0; alunos < notas.length; alunos++){    //lenght = tamanho da lista digitado
            System.out.printf("Digite a nota do aluno %d: %n", alunos+1);
            notas[alunos] = input.nextDouble();
        }

        double somaNotas = 0;

        for (int alunos = 0; alunos < notas.length; alunos++){
            somaNotas = somaNotas + notas[alunos];
        }


        double media = somaNotas / notas.length;
        System.out.printf("%nMédia da turma é: %.2f%n", media);


        int melhoresAlunos = 0;
        for (int alunos = 0; alunos < notas.length; alunos++){
            if (notas[alunos] >= media){
                melhoresAlunos++;
            }
        }

        System.out.printf("Quantidade de alunos acima da média da turma: %d", melhoresAlunos);
    }
}


//sum() > soma a quantidade de elementos do array