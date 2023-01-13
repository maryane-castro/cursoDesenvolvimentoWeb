package exercicios;

public class cons5a {
    String nome;
    double saldo;

    public cons5a(String nome, double saldo){
        this.nome = nome;
        if (saldo >= 0){
            this.saldo = saldo;
        } else{
            saldo = 0;
        }
        
    }

    public void setSaldo(double deposito){
        if (deposito > 0){
            this.saldo += deposito;
        }
        else{
            System.out.println("Deposito inválido");
        }
    }

    public void Saldo(double debito){
        if (debito > 0){
            this.saldo -= debito;
        }
        else{
            System.out.println("Debito inválido.");
        }
    }

    public double getSaldo(){
        return saldo;
    }
    
}
