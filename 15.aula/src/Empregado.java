public class Empregado {
    private final String firstName;
    private String lastName;
    private final Data birthDate;
    private final Data hireDate;

    private int id;
    
    
    
    public Empregado(String firstName, String lastName, Data birthDate, Data hireDate, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.id = id;
    }

    public Empregado(Empregado funcionario){
        firstName = funcionario.firstName;
        lastName = funcionario.lastName;
        birthDate = funcionario.birthDate;
        hireDate = funcionario.hireDate;   
        id = funcionario.id;
    }

    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }


    public String toString() {
    return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, 
    birthDate);
     }

     

}
    
