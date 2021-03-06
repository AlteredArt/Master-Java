Nested Conditional Statements

We can create more complex conditional structures by creating nested conditional statements, which is created by placing conditional statements inside other conditional statements:

if (outer condition) {
  if (nested condition) {
    Instruction to execute if both conditions are true
  }
}

When we implement nested conditional statements, the outer statement is evaluated first. If the outer condition is true, then the inner, nested statement is evaluated.

Let’s create a program that helps us decide what to wear based on the weather:

int temp = 45;
boolean raining = true;
 
if (temp < 60) {
  System.out.println("Wear a jacket!");
  if (raining == true) {
    System.out.println("Bring your umbrella.");
  } else {
    System.out.println("Leave your umbrella home.");
  }
}

In the code snippet above, our compiler will check the condition in the first if-then statement: temp < 60. Since temp has a value of 45, this condition is true; therefore, our program will print Wear a jacket!.

Then, we’ll evaluate the condition of the nested if-then statement: raining == true. This condition is also true, so Bring your umbrella is also printed to the screen.

Note that, if the first condition was false, the nested condition would not be evaluated.




public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;
    
    public Order(boolean filled, double cost, String shippingMethod, String coupon) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
      couponCode = coupon;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
      if (shipping.equals("Regular")) {
        return 0;
      } else if (shipping.equals("Express")) {
        // Add your code here
        if(couponCode.equals("ship50")){
          return .85;
        } else {
          return 1.75;
        }
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Order book = new Order(true, 9.99, "Express", "ship50");
      Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
      
      book.ship();
      chemistrySet.ship();
    }
  }



  High value item!
Shipping
Shipping cost: 0.85
Order not ready