/*Crie uma classe Employee que inclui três atributos: um
primeiro nome (String), um último nome (String) e um
salário mensal (double). Forneça um construtor que inicializa
os três atributos. Forneça métodos set e get para cada atributo.
Se o salário mensal não for positivo, não inicialize o seu valor.
Escreva um programa EmployeeTest que demonstra as
capacidades da classe Employee. Crie dois objetos Employee e
mostre o salário anual de cada objeto.
Depois dê a cada
empregado um aumento de 10% e mostre o salário anual dos
empregados novamente. */

package exercicios;

import java.util.Scanner;

public class ex5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cons5b conta1 = new cons5b("Maryane", "Castro", 40000); //user1

        cons5b conta2 = new cons5b("Mara", "Célia", 0); //user2


        System.out.printf("Primeiro Nome: %s%nUltimo Nome: %s%nSalário: %.2f%n", conta1.getnomeP(), conta1.getnomeU(), conta1.getsalario());
        
        System.out.printf("Primeiro Nome: %s%nUltimo Nome: %s%nSalário: %.2f%n", conta2.getnomeP(), conta2.getnomeU(), conta2.getsalario());


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        conta1.Aumento();
        conta2.Aumento();

        System.out.printf("Novo salário user1: %f%n", conta1.getsalario());
        System.out.printf("Novo salário user2: %f%n", conta2.getsalario());

    }
}
