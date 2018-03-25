class Flea {
	
	// Properties of the class...
	public String name;
	
	// Constructor of the class...
	public Flea(String aName) {
		name = aName;
	}
	// Methods of the class...
	public String toString() {
		return "I am a flea called " + name;
	}
}

class Dog {
	
	// Properties of the class...
	public String name;
	private int age;
	public Flea dogsFlea;
	
	// Constructor of the class...
	public Dog(String aName, int anAge, Flea aFlea) {
		name = aName;
		age = anAge;
		dogsFlea = aFlea;
	}
	
	// Method(s)
	public String toString() {
		return "I am a dog called " + name + " and I am " + age + " years old. I also have a Flea, called " + dogsFlea.name;
	}
}

class DogOwner{
	
	// Properties
	public String name;
	private int salary;
	public Dog ownersDog;

	// Constructor
	public DogOwner(String aName, int aSalary, Dog aDog) {
		name = aName;
		salary = aSalary;
		ownersDog = aDog;
	}

	// Method(s)
	public String toString(){
		return "My name is " + name + " and I have a dog called " + ownersDog.name;
	}
}

class DogTest {
	// The main method is the point of entry into the program...
	public static void main(String[] args) {
	
	// 2
	Flea f1 = new Flea("Pop");
	Flea f2 = new Flea("Squeack");
	Flea f3 = new Flea("Zip");

	// 3
	Dog d1 = new Dog("Rex", 3, f1);
	Dog d2 = new Dog("Jimbo", 8, f2);
	Dog d3 = new Dog("Fido", 5, f3);

	// 4
	System.out.println(d1.toString());

	// 6
	DogOwner a = new DogOwner("Angus", 20000, d1);
	DogOwner do2 = new DogOwner("Brian", 15000, d2);
	DogOwner do3 = new DogOwner("Charles", 3500, d1);

	// 7
	System.out.println(do2.toString());
	System.out.println(do3.toString());

	// 8: the toString method from Flea is called
	System.out.println(a.ownersDog.dogsFlea.toString());

	}
}

