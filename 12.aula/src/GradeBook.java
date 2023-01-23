public class GradeBook {

    private String nomeCurso;
    private double [] notasAlunos;


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
}
