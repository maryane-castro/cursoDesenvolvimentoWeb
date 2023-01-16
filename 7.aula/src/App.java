public class App { //AULA DE MANIPULAÇÃO DE STRINGS
    public static void main(String[] args) {
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        if (s3.regionMatches( 0, s4, 0, 5)){
            System.out.println("iguais");
        } else{
            System.out.println("não iguais");
        }

        if (s3.regionMatches(true, 0, s4, 0, 5)){ //ignorou as letras minusculas (true ignore)
            System.out.println("true");
        } else{
            System.out.println("não igual");
        }

        String s1 = "started";
        String s2 = "saved";

        if (s1.startsWith("st")) {
            System.out.println("verdadeiro");
        }

        if (s2.startsWith("st")) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("false");
        }

        if (s1.endsWith("ed")){
            System.out.println("verdadeiro");
        }

        /*
          latter.indexOf
          latter.lastIndexOf   pesquisa
         */
    }
}
