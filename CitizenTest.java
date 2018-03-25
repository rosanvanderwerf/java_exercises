class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }
   
   public Citizen(String aName) {
       name = aName;
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public void salaryRise(int amount) {
       salary = salary + amount;
   }
   public void netWorth() {
       System.out.println(Math.abs(savings-loan));
   }
   public String toString() {
       String line = "Name: " + name + " Salary: " + salary + " Savings: " + savings + " Loan: " + loan;
       return line;
   }
}

public class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);

      //System.out.println("Ernie's salary is: " + e.getSalary());
      
      // 2
      e.salaryRise(10000);
      
      // 3
      e.netWorth();
      
      // 4: Voor wanneer Citizen wordt aangeroepen vanuit elders
      
      // 5
      System.out.println(e.toString());
      
      // 6
      Citizen f = new Citizen("Fred");
      System.out.println(f.toString());
   }
}