public class App {
    public static void main(String[] args) {

        Data dataNascimento = new Data(7, 20, 1994);
        Data dataContratacao = new Data (1,26,2023);


        Empregado func1 = new Empregado("Thiago", "Rocha", dataNascimento, dataContratacao, 243);

        Empregado funcNew = new Empregado(func1);

        System.out.printf("Funcionario: %s%n", func1);
    }
}














//final quer dizer que aquela string não pode mudar