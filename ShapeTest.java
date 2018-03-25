abstract class Shape {
    public abstract String getName();
    public abstract double getArea();
}

class Circle extends Shape {

   // Properties of the class...
   public double radius;

   // Constructor of the class...
   public Circle(double aRadius) {
      radius = aRadius;
   }
   
   // Method(s)
   public String getName() {
       return "circle";
   }
   
   public double getArea() {
       return Math.PI * radius * radius;
   }
}

class Triangle extends Shape {

   // Properties of the class...
   public double base;
   public double height;

   // Constructor of the class...
   public Triangle(double aBase, double aHeight) {
      base = aBase;
      height = aHeight;
   }
   
   // Method(s)
   public String getName() {
       return "triangle";
   }
   
   public double getArea() {
       return 0.5 * base * height;
   }
}

class Rectangle extends Shape {
    
    // Properties
    public double width;
    public double height;
    
    // Constructor
    public Rectangle(double aWidth, double aHeight) {
        width = aWidth;
        height = aHeight;
    }
    
    // Methods
    public String getName() {
       return "rectangle";
   }
   
   public double getArea() {
       return width * height;
   }
}

public class ShapeTest {

   public Shape[] myShapes;
   
   public void printAreas() {

      for (int i=0; i<myShapes.length; i++) {

         System.out.print("Shape " + i + " has area: " + myShapes[i].getArea() + "\n");

         /*if (myShapes[i] instanceof Circle) {
            Circle c = (Circle)myShapes[i];
            System.out.println(Math.PI * c.radius * c.radius);
         }
         if (myShapes[i] instanceof Triangle) {
            Triangle t = (Triangle)myShapes[i];
            System.out.println(0.5 * t.base * t.height);
         }
         if (myShapes[i] instanceof Rectangle) {
             Rectangle r = (Rectangle)myShapes[i];
             System.out.println(r.width * r.height);
         }*/
      }
   }

   public void printNames() {

      for (int i=0; i<myShapes.length; i++) {

         System.out.print("Shape " + i + " is a: " + myShapes[i].getName() + "\n");
         
         /*if (myShapes[i] instanceof Circle) {
            System.out.println("circle");
         }
         if (myShapes[i] instanceof Triangle) {
            System.out.println("triangle");
         }
         if (myShapes[i] instanceof Rectangle) {
             System.out.println("rectangle");
         }*/
      }
   }
   
   public void doStuff() {

      // create an empty shapes array...
      myShapes = new Shape[4];

      // fill in the values of the elements...
      myShapes[0] = new Circle(12.0);
      myShapes[1] = new Circle(6.3);
      myShapes[2] = new Triangle(3,8);
      myShapes[3] = new Rectangle(4,5);

      printNames();
      printAreas();
   }
   
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      ShapeTest me = new ShapeTest();
      me.doStuff();
   }
}
