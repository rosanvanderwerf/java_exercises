// Delete /* comments to 'see' questions 1 to 9

class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private int    salary;
    
   //Constructor of the class...
   /*public Person(String aName, int anAge, int aSalary) {
      name = aName;
      age  = anAge;
      salary = aSalary;
   }*/

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("my age is " + age);
      System.out.println("and a have a salary of " + salary + " dollars");
      commentAboutAge();
   }
   
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 30) {
          System.out.println("middle-aged person");
      }
      if (age > 60) {
          System.out.println("old person");
      }      
   }
   
   public void growOlder() {
       age = age + 1;
   }
   
   public void growOlderBy(int years) {
       age = age + years;
   }
   
   public void giveKnighthood() {
       name = "Sir " + name;
    }
}

public class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      //Person ls = new Person("Luke Skywalker",34,5000);
      //Person wp = new Person("Winston Peters",48,4000);

      // Let wp grow older
      /*
      wp.growOlder();
      wp.giveKnighthood();
      
      wp.talk();
      
      // Print ls age
      System.out.println("old age: " + ls.age);
      
      // Make Luke age by ten years
      ls.growOlderBy(10);
      */
      
      // 10
      Person ls = new Person();
      Person wp = new Person();
      
      ls.talk();
   }

}