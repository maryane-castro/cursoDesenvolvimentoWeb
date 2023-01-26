public class EmpregadoComissao {

        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;
        private double sales; // total weekly sales
        private double commissionRate; // commission percentage
        public EmpregadoComissao(String firstName, String lastName, String socialSecurityNumber, 
        double sales, double commissionRate) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.sales = sales;
         this.commissionRate = commissionRate;
        }
        public String getFirstName() {return firstName;}
        public String getLastName() {return lastName;}
        public String getSocialSecurityNumber() {return socialSecurityNumber;}
        public double getSales() {return sales;}
        public double getCommissionRate() {return commissionRate;}

        public double earnings(){
            return sales * commissionRate;
        }
        
        
        
        @Override // quer fazer substituição da classe, mas ele ajuda a não errar nessas mudanças, AJUDA A GENTE ERRAR MENOS
        public String toString() {
         return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", 
        firstName, lastName, "social security number", socialSecurityNumber, "total sales", 
        sales, "commission rate", commissionRate);
         }
}
