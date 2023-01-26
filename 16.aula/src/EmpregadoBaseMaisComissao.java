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

    @Override
    public double earnings() {
    // not allowed: commissionRate and grossSales private in superclass
    // only public and protected members are directly accessible in the subclass
    return baseSalary + (getCommissionRate() * getSales());
    } // the same problem occurs in method toString. We could use public get methods inherited 
    // from superclasses
}
