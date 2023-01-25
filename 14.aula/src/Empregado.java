public class Empregado {
    private String firstName;
        private String lastName;
        private Data birthDate; // composition
        private Data hireDate; // composition
    public Empregado(String firstName, String lastName, Data birthDate, Data hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
        public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, 
    birthDate);
        }
}
