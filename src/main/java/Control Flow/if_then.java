If-Then Statement
The if-then statement is the most simple control flow we can write. It tests an expression for truth and executes some code based on it.

if (flip == 1) {
 
  System.out.println("Heads!");
 
}
The if keyword marks the beginning of the conditional statement, followed by parentheses ().
The parentheses hold a boolean datatype.
For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.

The boolean condition is followed by opening and closing curly braces that mark a block of code. This block runs if, and only if, the boolean is true.

boolean isValidPassword = true;
 
if (isValidPassword) {
 
  System.out.println("Password accepted!");
 
}
 
// Prints "Password accepted!"
 
int numberOfItemsInCart = 9;
 
if (numberOfItemsInCart > 12) {
 
  System.out.println("Express checkout not available");
 
}
 
// Nothing is printed.
If a conditional is brief we can omit the curly braces entirely:

if (true) System.out.println("Brevity is the soul of wit");
Note: Conditional statements do not end in a semicolon.


public class Order {
  
  public static void main(String[] args) {
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    if(itemCost > 24.00){
      System.out.println("High Value");
    }
    
  }
  
}

Output: 
High Value