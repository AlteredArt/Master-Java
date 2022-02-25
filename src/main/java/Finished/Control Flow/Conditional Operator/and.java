Conditional-And: &&

Let’s return to our student enrollment program. We’ve added an additional requirement: not only must students have the prerequisite, but their tuition must be paid up as well. We have two conditions that must be true before we enroll the student.

Here’s one way we could write the code:

if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}

We’ve nested two if-then statements. This does the job but we can be more concise with the AND operator:

if (tuitionPaid && hasPrerequisite) {
  // enroll student
}

The AND operator, &&, is used between two boolean values and evaluates to a single boolean value. If the values on both sides are true, then the resulting value is true, otherwise the resulting value is false.

This code illustrates every combination:

true && true
// true
false && true
// false
true && false
// false
false && false
// false



public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      /* 
         Write conditional
         ~~~~~~~~~~~~~~~~~
         if restaurantCapacity is greater
         
         or equal to guestCount
         AND
         the restaurant is open:
           print "Reservation confirmed"
           set isConfirmed to true
         else:
           print "Reservation denied"
           set isConfirmed to false
      */
      if(restaurantCapacity >= guestCount && isRestaurantOpen){
        System.out.println("Reservation is confirmed");
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





  Reservation is confirmed
Please enjoy your meal!
Reservation denied
Please enjoy your meal!
