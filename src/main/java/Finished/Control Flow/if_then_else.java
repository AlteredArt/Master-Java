If-Then-Else

We’ve seen how to conditionally execute one block of code, but what if there are two possible blocks of code we’d like to execute?

Let’s say if a student has the required prerequisite, then they enroll in the selected course, else they’re enrolled in the prerequisite course instead.

We create an alternate conditional branch with the else keyword:

if (hasPrerequisite) {
 
  // Enroll in course
 
} else {
 
  // Enroll in prerequisite
 
}

This conditional statement ensures that exactly one code block will be run. If the condition, hasPrerequisite, is false, the block after else runs.

There are now two separate code blocks in our conditional statement. The first block runs if the condition evaluates to true, the second block runs if the condition evaluates to false.

This code is also called an if-then-else statement:

    If condition is true, then do something.
    Else, do a different thing.






    public class Order {
  
        public static void main(String[] args) {
          
          boolean isFilled = false;
          
          // Write an if-then-else statement:
          if(isFilled){
            System.out.println("Shipping");
          } else {
            System.out.println("Order not ready");
          }
        
          
        }
        
      }



      Order not ready