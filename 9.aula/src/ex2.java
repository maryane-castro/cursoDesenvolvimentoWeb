import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000;

        System.out.print("Digite a quantidade de anos: ");
        double anos = input.nextDouble();
        double aux = anos;
        int anosFalta = 0;
        while (anos != 0){
            saldo = saldo * 1.02;
            --anos;
            anosFalta++;
            System.out.printf("%nSaldo depois de %d anos: %.2f%n", anosFalta, saldo);
            
        }

        System.out.printf("%nO saldo depois de %.0f será: %.2f", aux, saldo);
        
    }
}
