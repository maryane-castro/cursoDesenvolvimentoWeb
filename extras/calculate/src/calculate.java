import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {

        int i = 1;
        while (i == 1){
            Scanner input = new Scanner(System.in);
            
            System.out.println("1 - soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
            System.out.println("Escolha uma opção: ");
            int aux = input.nextInt();

            if (aux == 1){
                soma();
            } else if (aux == 2){
                sub();
            } else if(aux == 3){
                mul();
            } else if(aux == 4){
                div();
            } else{
                System.out.println("Não existe essa opção.");
            }
        }
    }
    

    static void soma(){
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        double n1 = input.nextDouble();
        System.out.print("number 2: ");
        double n2 = input.nextDouble();

        System.out.println(n1 + n2);
    }

    static void sub(){
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        double n1 = input.nextDouble();
        System.out.print("number 2: ");
        double n2 = input.nextDouble();

        System.out.println(n1 - n2);
    }

    static void mul(){
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        double n1 = input.nextDouble();
        System.out.print("number 2: ");
        double n2 = input.nextDouble();

        System.out.println(n1 * n2);
    }

    static void div(){
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        double n1 = input.nextDouble();
        System.out.print("number 2: ");
        double n2 = input.nextDouble();

        System.out.println(n1 / n2);
    }
    





}
