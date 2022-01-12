// Introduction
// When we work with arrays in Java, we’ve been limited by the fact that 
// once an array is created, it has a fixed size. We can’t add or remove elements.

// But what if we needed to add to the book lists, newsfeeds, and other 
// structures we were using arrays to represent?

// To create mutable and dynamic lists, we can use Java’s ArrayLists. 
// ArrayLists allow us to:

// Store object references as elements
// Store elements of the same type (just like arrays)
// Access elements by index (just like arrays)
// Add elements
// Remove elements
// Remember how we had to import java.util.Arrays in order to use additional 
// array methods? To use an ArrayList at all, we need to import them from 
// Java’s util package as well:

// import java.util.ArrayList;
// Let’s learn how to make use of this powerful object…

// Creating ArrayLists
// To create an ArrayList, we need to declare the type of objects it will hold, 
// just as we do with arrays:

// ArrayList<String> babyNames;
// We use angle brackets < and > to declare the type of the ArrayList. These 
// symbols are used for generics. Generics are a Java construct that allows us 
// to define classes and objects as parameters of an ArrayList. For this reason, 
// we can’t use primitive types in an ArrayList:

// // This code won't compile:
// ArrayList<int> ages;
 
// // This code will compile:
// ArrayList<Integer> ages;
// The <Integer> generic has to be used in an ArrayList instead. You can also use 
// <Double> and <Char> for types you would normally declare as doubles or chars.

// We can initialize to an empty ArrayList using the new keyword:

// // Declaring:
// ArrayList<Integer> ages;
// // Initializing:
// ages = new ArrayList<Integer>();
 
// // Declaring and initializing in one line:
// ArrayList<String> babyNames = new ArrayList<String>();

// import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    ArrayList<String> toDoList = new ArrayList<String>();
    
  }
  
}