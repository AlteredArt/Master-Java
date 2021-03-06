Semicolons and Whitespace

As we saw with comments, reading code is just as important as writing code.

We should write code that is easy for other people to read. Those people can be co-workers, friends, or even yourself!

Java does not interpret whitespace, the areas of the code without syntax, but humans use whitespace to read code without difficulty.

Functionally, these two code samples are identical:

System.out.println("Java");System.out.println("Lava");System.out.println("Guava");

System.out.println("Java");
 
System.out.println("Lava");
 
System.out.println("Guava");

They will print the same text to the screen, but which would you prefer to read? Imagine if it was hundreds of instructions! Whitespace would be essential.

Java does interpret semicolons. Semicolons are used to mark the end of a statement, one line of code that performs a single task.

The only statements we’ve seen so far are System.out.println("My message!");.

Let’s contrast statements with the curly brace, {}. Curly braces mark the scope of our classes and methods. There are no semicolons at the end of a curly brace.

public class LanguageFacts {
    public static void main(String[] args) {
      // Press enter or return on your keyboard after each semicolon!
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
       System.out.println("Programming is Great.");
    }
  }





  
  Output-only Terminal
  Output:
  
  Java is a class-based language.
  Java classes have a 'main' method.
  Java statements end with a semicolon.
  Programming is Great.
  



