public class App {

    //Crie dois métodos com o nome displayArray. O primeiro
    //método deve mostrar todos os elementos de um vetor de
    //inteiros. O segundo método deve mostrar todos os elementos de
    //um vetor de Strings. Também apresente um programa para
    //testar seus métodos a partir de chamadas a esses métodos.

    public static void main(String[] args) {
        int [] array1 = {2, 5, 3, 1};
        String [] array2 = {"Java", "Python", "C"};

        mostraArray(array1);
        mostraArray(array2);
    }



    private static void mostraArray(int [] arrayInts) {
        for (int element : arrayInts){
            System.out.println(element);
        }  
    }

    private static void mostraArray(String [] arrayString) {
        for (String element : arrayString){
            System.out.println(element);
        } 
    }

}

// return String.format("Digite a formatação %d%n")