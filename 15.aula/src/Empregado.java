public class Empregado {
    private final String firstName;
    private String lastName;
    private final Data birthDate;
    private final Data hireDate;
    
    
    
    public Empregado(String firstName, String lastName, Data birthDate, Data hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
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
    
