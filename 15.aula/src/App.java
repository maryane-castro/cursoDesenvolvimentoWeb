public class App {
    public static void main(String[] args) {

        Data dataNascimento = new Data(7, 20, 1994);
        Data dataContratacao = new Data (1,26,2023);


        Empregado func1 = new Empregado("Thiago", "Rocha", dataNascimento, dataContratacao, 243);

        Empregado funcNew = new Empregado(func1);
        funcNew.setId(123);;
        funcNew.setLastName("Alves");
        funcNew.setHireDate( new Data (5,26,2063));

        System.out.printf("Funcionario: %s%n", func1);
        System.out.printf("Funcionario: %s%n", funcNew);



        Empregado funcNew1 = new Empregado(func1);
        funcNew.setId(15423);;
        funcNew.setLastName("fd");
        funcNew.setHireDate( new Data (5,2556,2063));

        System.out.printf("Funcionario: %s%n", func1);
        System.out.printf("Funcionario: %s%n", funcNew);
    }
}














//final quer dizer que aquela string não pode mudar