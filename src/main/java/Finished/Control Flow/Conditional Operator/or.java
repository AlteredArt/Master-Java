Conditional-Or: ||

The requirements of our enrollment program have changed again. Certain courses have prerequisites that are satisfied by multiple courses. As long as students have taken at least one prerequisite, they should be allowed to enroll.

Here’s one way we could write the code:

if (hasAlgebraPrerequisite) {
  // Enroll in course
}
 
if (hasGeometryPrerequisite) {
  // Enroll in course
}

We’re using two different if-then statements with the same code block. We can be more concise with the OR operator:

if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}

The OR operator, ||, is used between two boolean values and evaluates to a single boolean value. If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.

This code illustrates every combination:

true || true
// true
false || true
// true
true || false
// true
false || false
// false

Keep Reading: AP Computer Science A Students

On some occasions, the compiler can determine the truth value of a logical expression by only evaluating the first boolean operand; this is known as short-circuited evaluation. Short-circuited evaluation only works with expressions that use && or ||.

In an expression that uses ||, the resulting value will be true as long as one of the operands has a true value. If the first operand of an expression is true, we don’t need to see what the value of the other operand is to know that the final value will also be true.

For example, we can run the following code without error despite dividing a number by 0 in the second operand because the first operand had a true value:

if (1 > 0 || 2 / 0 == 7) {
  System.out.println("No errors here!");
}

An expression that uses && will only result in true if both operands are true. If the first operand in the expression is false, the entire value will be false.






public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      // Write conditional statement below
      if(count < 1 || count > 8){
        System.out.print("Invalid reservation!");
      }
      
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      System.out.println("Please enjoy your meal!");
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }




  Reservation confirmed
Please enjoy your meal!
Reservation denied
Please enjoy your meal!