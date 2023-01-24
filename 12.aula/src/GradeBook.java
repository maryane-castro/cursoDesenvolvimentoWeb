public class GradeBook {

    private String nomeCurso;
    private double [] notasAlunos;
    

    /*private int umDois = 0;
    private int doisTres = 0;
    private int tresQuatro = 0;
    private int quatroCinco = 0;
    private int cincoSeis = 0;
    private int seisSete = 0;
    private int seteOito = 0;
    private int oitoNove = 0;
    private int noveDez = 0;
    private int zeroUm = 0;*/

    public GradeBook (String nomeCurso, double [] notasAlunos){ //contrutor necessita ter o mesmo nome da class e dizer os atributos obrigatorios.
        this.nomeCurso = nomeCurso;
        this.notasAlunos = notasAlunos;
    }


    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }



    public double getMediaTurma(){ //Cria um metodo getMedia turma, para calcular a media de notas da turma
        double somaNotas = 0;
        for (double nota : notasAlunos){
            somaNotas += nota;
        }

        return somaNotas / notasAlunos.length;
    }

    public double getMenorNota(){
        double menorNota = notasAlunos[0];
        for(double nota : notasAlunos){
            if (menorNota < nota){
                menorNota = nota;
            }
        }
        return menorNota;
    }

    public double getMaiorNota(){
        double maiorNota = notasAlunos[0];
        for (double nota : notasAlunos){
            if (maiorNota < nota){
                maiorNota = nota;
            }
        }
        return maiorNota;
    }


    /*DISTRIBUIÇÃO */

    public void getDistribuicaoNotas(){
        int [] frequenciaFaixasNotas = new int [10];
        
        for (double nota : notasAlunos){
            if (nota < 10){
                frequenciaFaixasNotas[(int) nota]++;
            }  else {
                frequenciaFaixasNotas[9]++;
            }
        }
        motraDistribuicaoNotas(frequenciaFaixasNotas);
    }

//
//            if (0 <= nota && nota < 1){
//                frequenciaFaixasNotas[0]++;
//            } else if (1 <= nota && nota < 2){
//                frequenciaFaixasNotas[1]++;
//            } else if (2 <= nota && nota < 3){
//                frequenciaFaixasNotas[2]++;
//            } else if (3 <= nota && nota < 4){
//                frequenciaFaixasNotas[3]++;
//            } else if (4 <= nota && nota < 5){
//                frequenciaFaixasNotas[4]++;
//            } else if (5 <= nota && nota < 6){
//                frequenciaFaixasNotas[5]++;
//            } else if (6 <= nota && nota < 7){
//                frequenciaFaixasNotas[6]++;
//            } else if (7 <= nota && nota < 8){
//                frequenciaFaixasNotas[7]++;
//            } else if (8 <= nota && nota < 9){
//                frequenciaFaixasNotas[8]++;
//            } else if (9 <= nota && nota <= 10){
//                frequenciaFaixasNotas[9]++;
//            }
//        }
//        motraDistribuicaoNotas(frequenciaFaixasNotas);
//    }


    private void motraDistribuicaoNotas(int [] frequenciaNotas){
        System.out.println("Distribuição das notas: ");
        for (int i = 0; i < frequenciaNotas.length; i++){
            System.out.printf("Quantidade de notas entre %d e %d: %d", i, i+1, frequenciaNotas[i]);
        }


    }

    
}
