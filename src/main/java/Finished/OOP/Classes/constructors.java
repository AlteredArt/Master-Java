Classes: Constructors

In order to create an object (an instance of a class), we need a constructor method. The constructor is defined within the class.

Let’s take a look at the Car class with a constructor. The constructor, Car(), shares the same name as the class:

public class Car {
  // Constructor method
  public Car() {
    // instructions for creating a Car instance
  }  
 
  public static void main(String[] args) {
    // body of main method
  }
}

To create an instance, we need to call or invoke the constructor within main(). The following example assigns a Car instance to the variable ferrari:

public class Car {
 
  public Car() {
    // instructions for creating a Car instance
  }
 
  public static void main(String[] args) {
    // Invoke the constructor
    Car ferrari = new Car(); 
  }
}

In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type. This means that the value of our variable is a reference to an instance’s memory address. During its declaration, the class name is used as the variable’s type. In this case, the type is Car.

After the assignment operator, (=), we invoke the constructor method: Car(), and use the keyword new to indicate that we’re creating an instance. Omitting new causes an error.

If we were to output the value of ferrari we would see its memory address:

Car@76ed5528

Keep Reading: AP Computer Science A Students

We can initialize a reference-type variable without assigning it a reference if we utilize the special value null. Something that is null has no value; if we were to assign null to an object, it would have a void reference.

For example, in the following code snippet, we’ll create an instance of Car, assign it a reference, and then change its value to null:

Car thunderBird = new Car();
System.out.println(thunderBird); // Prints: Car@76ed5528
 
thunderBird = null; // change value to null
System.out.println(thunderBird); // Prints: null

It’s important to note that if we use a null reference to call a method or access an instance variable, we will receive a NullPointerException error.



public class Store {
  
    // new method: constructor!
    public Store() {
      System.out.println("I am inside the constructor method.");
    }
    
    // main method is where we create instances!
    public static void main(String[] args) {
      System.out.println("Start of the main method.");
      
      // create the instance below
      
      // print the instance below
      Store lemonadeStand = new Store();
      System.out.println(lemonadeStand);
    }
  }


  Start of the main method.
I am inside the constructor method.
Store@2aae9190