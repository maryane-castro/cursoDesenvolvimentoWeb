package classe;
import java.util.Scanner;

/*
SET pega a string
GET mostra a string
 */
public class Conta {
    public static void main(String[] args) {
        ContChama conta1 = new ContChama();
        
        System.out.printf("Nome da conta: %s%n", conta1.getNome());
        System.out.println(); 

        

        Scanner input = new Scanner(System.in);

        /* 
        String teste = input.nextLine();
        System.out.println(teste);
        */

   
        System.out.print("Digite uma String para ser setada: ");
        conta1.setNome(input.nextLine());
        ContChama conta2 = conta1; //obj2 recebe o valor do objj2
        System.out.println(conta2.getNome()); //aqui ele mostra o valor do obj2

        System.out.printf("A String setada foi: %s ",conta1.getNome());
        
        /*ambos objetos vão ter os mesmo valores, já que é o mesmo espaço de memória!! */
        

        conta1.setSaldo(21);
        System.out.println(conta1.getSaldo());
      
    }
}

