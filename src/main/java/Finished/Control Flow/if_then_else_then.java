If-Then-Else-If

The conditional structure we’ve learned can be chained together to check as many conditions as are required by our program.

Imagine our program is now selecting the appropriate course for a student. We’ll check their submission to find the correct course enrollment.

The conditional statement now has multiple conditions that are evaluated from the top down:

String course = "Theatre";
 
if (course.equals("Biology")) {
 
  // Enroll in Biology course
 
} else if (course.equals("Algebra")) {
 
  // Enroll in Algebra course
 
} else if (course.equals("Theatre")) {
 
  // Enroll in Theatre course
 
} else {
 
  System.out.println("Course not found!");
 
}

The first condition to evaluate to true will have that code block run. Here’s an example demonstrating the order:

int testScore = 72;
 
if (testScore >= 90) {
 
  System.out.println("A");
 
} else if (testScore >= 80) {
 
  System.out.println("B");
 
} else if (testScore >= 70) {
 
  System.out.println("C");
 
} else if (testScore >= 60) {
 
  System.out.println("D");
 
} else {
 
  System.out.println("F");
 
}
// prints: C

This chained conditional statement has two conditions that evaluate true. Because testScore >= 70 comes before testScore >= 60, only the earlier code block is run.

Note: Only one of the code blocks will run.





public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
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
           // declare conditional statement here
      if(shipping == "Regular"){
        return 0;
      } else if(shipping == "Express"){
        return 1.75;
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Order book = new Order(true, 9.99, "Express");
      Order chemistrySet = new Order(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
  }

  


  High value item!
Shipping
Shipping cost: 1.75
Order not ready