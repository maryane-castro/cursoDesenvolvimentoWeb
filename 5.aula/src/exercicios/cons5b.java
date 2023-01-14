package exercicios;

public class cons5b {
    String nomeP;
    String nomeU;
    double salario;
    double aumento = 1.1;

    public cons5b(String nomeP, String nomeU, double salario){
        this.nomeP = nomeP;
        this.nomeU = nomeU;
        if (salario > 0){
            this.salario = salario;
        } else {
            System.out.print("Salário Inválido.");
        }
        
    }

/***********SETTER**********************/

    public void setPrimeiroNome(String nomeP){
        this.nomeP = nomeP;
    }

    public void setSegundoNome(String nomeU){
        this.nomeU = nomeU;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
/***********GETTER**********************/

    public String getnomeP(){
        return nomeP;
    }

    public String getnomeU(){
        return nomeU;
    }

    public double getsalario(){
        return salario;
    }

/*-----------------Aumento-------------------- */
    
    public void Aumento(){
        this.salario = salario * 1.1;
    }

}
