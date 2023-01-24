import java.util.Scanner;

public class App {
    //PEDE NOTAS DE UMA ALUNO PARA INSTANCIAR DE OUTRTA CLASS
    //USA CONSTRUTOR.



    public static void main(String[] args)  {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a quantidade de aluno: ");
        
        double [] notasCursoJava = new double[input.nextInt()];
        System.out.printf("Digite a nota dos aluno %n");
        for (int i = 0; i < notasCursoJava.length; i++){
            System.out.printf("Digite a nota do alubo %d° aluno(a): ", i+1);
            notasCursoJava[i] = input.nextDouble();
        }
        

        GradeBook cursoJava = new GradeBook("Curso Java - Saper", notasCursoJava);

        System.out.printf("Nome do curso: %s%n", cursoJava.getNomeCurso());

        System.out.printf("Media Turma: %.2f%n", cursoJava.getMediaTurma());
        System.out.printf("Maior NOTA: %.2f%n ", cursoJava.getMaiorNota());


        cursoJava.getDistribuicaoNotas();
        cursoJava.relatorio();
    }
}
