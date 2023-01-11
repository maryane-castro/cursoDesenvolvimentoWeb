import java.util.Scanner;

public class aula4a {
    public static void main(String[] args) {  //main é o ponto de entrada
        sun(1, 2);
        

    }

    static void strucions(){
        var login = "Jonh";
        var senha = 9876;
        double num1 = 1.0;
        double num2 = 2.0;
        System.out.printf("%s %d %n",login, senha);
        System.out.printf("%f", num1 + num2);

  
    }

    static void soma(){                          //soma que não necessita de numero previo
        Scanner entrada = new Scanner(System.in);

        System.out.print("Number 1: ");
        double num1 = entrada.nextDouble();
        System.out.print("Number 2: ");
        double num2 = entrada.nextDouble();

        System.out.printf("Resulte: %f", num1 +  num2);
    }

    static void sun(int x, int y){  //aqui ele espera dois numero, para fazer a soma
        int soma = x + y;
         System.out.print(soma);
    }
}
