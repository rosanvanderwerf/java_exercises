class CartoonCharacter {

   // Properties of the class...
   private String name;
   public String favouriteColour;
   private int    favouriteNumber;
   public static int count;

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      count = count + 1;
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class FredFlintstone {

   // Properties of the class...
   static String name            = "Fred Flintstone";
   static String favouriteColour = "blue";
   static int    favouriteNumber = 42;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class WilmaFlintstone {

   // Properties of the class...
   static String name            = "Wilma Flintstone";
   static String favouriteColour = "red";
   static int    favouriteNumber = 63;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class BarneyRubble {

   // Properties of the class...
   static String name            = "Barney Rubble";
   static String favouriteColour = "yellow";
   static int    favouriteNumber = 2;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

public class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
       
       // 2: FredFlintstone.displayMe();
       
       // 3: System.out.println(BarneyRubble.favouriteColour);
       
       // 4
       CartoonCharacter fred = new CartoonCharacter("Fred Flintstone","blue",42);
       CartoonCharacter wilma = new CartoonCharacter("Wilma Flintstone","red",63);
       CartoonCharacter barney = new CartoonCharacter("Barney Rubble","yellow",2);
       
       // 5
       fred.displayMe();
       wilma.displayMe();
       barney.displayMe();
       
       // 6
       System.out.println(barney.favouriteColour);
       
       // 7: non-static variable cannot be referenced from static context
       System.out.println(CartoonCharacter.count);
       
       // 8
       System.out.println(Math.PI);
   }
}
