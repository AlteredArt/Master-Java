Classes: Multiple Fields
Objects are not limited to a single instance field. We can declare as many fields as are necessary for the requirements of our program.

Let’s change Car instances so they have multiple fields.

We’ll add a boolean isRunning, that indicates the car engine is on and an int velocity, that indicates the speed at which the car is traveling.

public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;
 
  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }
 
  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);
 
    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}
The constructor now has multiple parameters to receive values for the new fields. We still specify the type as well as the name for each parameter.

Ordering matters! We must pass values into the constructor invocation in the same order that they’re listed in the parameters.

// values match types, no error
Car honda = new Car("green", false, 0);
 
// values do not match types, error!
Car junker = new Car(true, 42, "brown");
 

public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}


