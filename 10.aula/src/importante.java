public class importante {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        double soma = 0;

        for (double number : array){
            soma = soma + number;
            System.out.println(soma);
        }


    }
}
