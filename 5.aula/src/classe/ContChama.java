package classe;
/*Mesma coisa em python!! */
public class ContChama {
    private String nome;                      //criação de variaveis
    private double saldoBancario;




    public void setNome(String nome){       //inicia a variavel, como se fosse o __init__
        this.nome = nome;
    }
    public String getNome(){                //aqui é como se fosse uma função
        return nome+"21";
    }

    public void setSaldo(double saldoBancario){
        this.saldoBancario = saldoBancario;
    }

    public double getSaldo(){
        return saldoBancario;
    }
}
