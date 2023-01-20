public class testeArrayMetodos {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        multiplyArrayBy2(array);
        System.out.printf("O valor modificado do array: %n");
        for (int value : array){ //classe que percorre a lista(array) e multiplica por 2
            System.out.printf("%d", value);
        }
    }


    private static void multiplyArrayBy2(int[] oldArray){
        for (int counter = 0; counter < oldArray.length; counter++){
            oldArray[counter] *= 2;
        }
    }
}
