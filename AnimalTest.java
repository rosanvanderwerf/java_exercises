class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("hi");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

public class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly();

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills);
      b.talk();
      //b.attack(); 

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills);
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();
      
      // 1d: Eagle erft van Bird, en in Bird krijgt een instance automatisch twee poten
      
      // 1e: a.fly() geeft een error omdat a een instance is van Class Animal, en Animal heeft geen .fly() method
      a = b;
      a.talk();
      //a.fly();
      
      // 1f: b = a geeft een error omdat a(nimal) niet geconverteerd kan worden naar een b(ird)
      //b = a;
      b.talk();
      b.fly();
   }
}