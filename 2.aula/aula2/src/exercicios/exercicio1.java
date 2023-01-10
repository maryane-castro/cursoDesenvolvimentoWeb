package exercicios;
import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        //numero elevado: 5 elevado a 2, mesmo que coloque como int, ele considera inteiro
        
        Scanner entrada = new Scanner(System.in);
        int barra;
        int resto;

        System.out.print("Digite o tamanho da barra: ");
        barra = entrada.nextInt();

        resto = barra % 5;

        System.out.printf("O resto da barra é: %d metros", resto);

        
    }
}
