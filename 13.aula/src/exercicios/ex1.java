package exercicios;

public class ex1 {
    public static void main(String[] args) {
        //sobrecarga de metodos

        /*formatação em metodos
        return String.format("Digite a formatação %d%n")*/

        double [] notaAlunos = {0.8};
        int [] frequenciaFaixasNotas = new int [10]; //10 linhas 

        for (double nota : notaAlunos){
            if (nota < 10){
                frequenciaFaixasNotas[(int) nota]++;
                System.out.println(nota);
            }  else {
                frequenciaFaixasNotas[9]++;
            }
        }

        System.out.println("Distribuição das notas: ");
        for (int i = 0; i < frequenciaFaixasNotas.length; i++){
            System.out.printf("Quantidade de notas entre %d e %d: %d%n", i, i+1, frequenciaFaixasNotas[i]);
        }
    }
}
