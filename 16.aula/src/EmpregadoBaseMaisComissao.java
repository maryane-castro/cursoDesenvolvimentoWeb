public class EmpregadoBaseMaisComissao extends EmpregadoComissao {
    private double baseSalary;

    public EmpregadoBaseMaisComissao(String firstName, String lastName, 
        String socialSecurityNumber, double grossSales, 
        double commissionRate, double baseSalary) {



    // explicit call to superclass constructor
    // needed when superclass does not have a no-argument constructor
    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate); //da outra classe (Empregado Comissão)
    this.baseSalary = baseSalary; //atributo unico dessa classe
    }

    public void setBaseSalary(double newBaseSalary){
        baseSalary = newBaseSalary;
    }
    public double getBaseSalary() {return baseSalary;}


    @Override
    public double earnings() {
    return getBaseSalary() + super.earnings(); // código em azul aproveita código já feito
    } // e a forma de calcular os ganhos pode mudar
    @Override
    public String toString() {
    return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary",
    getBaseSalary());
    }

    //mudança da classe de baixo, usando o earnings da classe pai


/* 
    @Override
    public double earnings() {
    // not allowed: commissionRate and grossSales private in superclass
    // only public and protected members are directly accessible in the subclass
    return baseSalary + (getCommissionRate() * getSales());
    } // the same problem occurs in method toString. We could use public get methods inherited 
    // from superclasses

    
    
   

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
         "base-salaried commission employee", getFirstName(), getLastName(),
        "social security number", getSocialSecurityNumber(), "gross sales", getSales(),
        "commission rate", getCommissionRate(), "base salary", getBaseSalary());
         }*/
        
}
