public class EmpregadoBaseMaisComissao {
    private final String firstName;
private final String lastName;
private final String socialSecurityNumber;
private double sales; // total weekly sales
 private double commissionRate; // commission percentage10
private double baseSalary; // base salary per week
public EmpregadoBaseMaisComissao(String firstName, String lastName, String socialSecurityNumber, double sales,
 double commissionRate, double baseSalary) {
 this.firstName = firstName;
 this.lastName = lastName;
 this.socialSecurityNumber = socialSecurityNumber;
 this.sales = sales;
 this.commissionRate = commissionRate;
 this.baseSalary = baseSalary;
 }
 public String getFirstName() {return firstName;}
 public String getLastName() {return lastName;} // . . . // outros métodos
 @Override
 public String toString() {
 return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee",
 firstName, lastName, "social security number", socialSecurityNumber, "total sales", sales,
 "commission rate", commissionRate, "base salary", baseSalary);
 }
}
