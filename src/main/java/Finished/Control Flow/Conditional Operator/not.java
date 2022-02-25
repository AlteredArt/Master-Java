Logical NOT: !

The unary operator NOT, !, works on a single value. This operator evaluates to the opposite boolean to which it’s applied:

!false
// true
!true
// false

NOT is useful for expressing our intent clearly in programs. For example, sometimes we need the opposite behavior of an if-then: run a code block only if the condition is false.

boolean hasPrerequisite = false;
 
if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}

This code does what we want but it’s strange to have a code block that does nothing!

The logical NOT operator cleans up our example:

boolean hasPrerequisite = false;
 
if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}

We can write a succinct conditional statement without an empty code block.





public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
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
      // Write conditional here
      if(!isConfirmed){
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
  
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
Unable to confirm reservation, please contact restaurant.
