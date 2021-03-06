// String Concatenation

// We have covered a lot of built-in functionality in Java throughout 
// this lesson. We’ve seen +, -, <, ==, and many other operators. Most of 
// these only work on primitives, but some work on Strings too!

// Let’s say we want to print out a variable, and we want to describe it as 
// we print it out. For our bank account example, imagine we want to tell the user:

// Your username is: <username>
// With the value of the variable username displayed.

// The + operator, which we used for adding numbers together, can be used to 
// concatenate Strings. In other words, we can use it to join two Strings together!

// String username = "PrinceNelson";
// System.out.println("Your username is: " + username);
// This code will print:

// Your username is: PrinceNelson
// We can even use a primitive datatype as the second variable to concatenate, 
// and Java will intelligently make it a String first:

// int balance = 10000;
// String message = "Your balance is: " + balance;
// System.out.println(message);
// This code will print:

// Your balance is: 10000

public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      String zooDescription = "Our zoo has " + animals + " " + species + "s!";
      System.out.println(zooDescription);
    }       
}

// Output: Our zoo has 12 zebras.