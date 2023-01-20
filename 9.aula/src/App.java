import java.util.Scanner;

//VETORES
public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int [] listaA = new int[12];
        String [] listaB = new String[10];
 
        listaA [1] = 12;
        listaB [2] = "UEPA";
        System.out.println(listaA[1]);
        System.out.println(listaB[2]);


        System.out.println("posição1: ");
        listaA [8] = input.nextInt();
        System.out.println(listaA[1] * 2);

        System.out.println(listaA.length); 


        int elementos = 0;
        System.out.print("Digite a quantidade de elementos: ");
        elementos = input.nextInt();

        int [] lista = new int[elementos];

        for(int i = 0; i < lista.length; i++){
            System.out.println(i);
            if (i % 2 == 0){
                lista[i] = 0;
            } else{
                lista[i] = 1;
            }       
        }
        
        for(int aux = 0; aux < lista.length; aux++){
            System.out.println(lista[aux]);
        }



    }
}
