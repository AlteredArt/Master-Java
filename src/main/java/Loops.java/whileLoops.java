// A while loop looks a bit like an if statement:

// while (silliness > 10) {
 
//   // code to run
 
// }
// Like an if statement, the code inside a while loop will only 
// run if the condition is true. However, a while loop will continue 
// running the code over and over until the condition evaluates to 
// false. So the code block will repeat until silliness is less than 
// or equal to 10.

// // set attempts to 0
// int attempts = 0;
 
// // enter loop if condition is true
// while (passcode != 0524 && attempts < 4) {
 
//   System.out.println("Try again.");
//   passcode = getNewPasscode();
//   attempts += 1;
 
//   // is condition still true?
//   // if so, repeat code block
// }
// // exit when condition is not true
// while loops are extremely useful when you want to run some code 
// until a specific change happens. However, if you aren’t certain 
// that change will occur, beware the infinite loop!

// Infinite loops occur when the condition will never evaluate to false. 
// This can cause your entire program to crash.

// int hedgehogs = 5;
 
// // This will cause an infinite loop:
// while (hedgehogs < 6) {
 
//   System.out.println("Not enough hedgehogs!");
 
// }
// In the example above, hedgehogs remains equal to 5, which is less than 6. 
// So we would get an infinite loop.

// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while (dieRoll != 5) {
      
      System.out.println(dieRoll);
			dieRoll = randomGenerator.nextInt(6) + 1;

    }
    
  }
  
}



// Incrementing While Loops
// When looping through code, it’s common to use a counter variable. A counter (also known as an iterator) is a variable used in the conditional logic of the loop and (usually) incremented in value during each iteration through the code. For example:

// // counter is initialized
// int wishes = 0;
 
// // conditional logic uses counter
// while (wishes < 3) {
 
//   System.out.println("Wish granted.");
//   // counter is incremented
//   wishes++;
 
// }
// In the above example, the counter wishes gets initialized before 
// the loop with a value of 0, then the program will keep printing 
// "Wish granted." and adding 1 to wishes as long as wishes has a 
// value of less than 3. Once wishes reaches a value of 3 or more, 
// the program will exit the loop.

// So the output would look like:

// Wish granted.
// Wish granted.
// Wish granted.
// We can also decrement counters like this:

// int pushupsToDo = 10;
 
// while (pushupsToDo > 0) {
 
//   doPushup();
//   pushupsToDo--;
 
// }
// In the code above, the counter, pushupsToDo, starts at 10, and 
// increments down one at a time. When it hits 0, the loop exits.

  System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);