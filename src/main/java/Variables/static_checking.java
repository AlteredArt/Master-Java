// Static Checking

// The Java programming language has static typing. Java programs will not 
// compile if a variable is assigned a value of an incorrect type. This is a 
// bug, specifically a type declaration bug.

// Bugs are dangerous! They cause our code to crash, or produce incorrect results. 
// Static typing helps because bugs are caught during programming rather than 
// during execution of the code.

// The program will not compile if the declared type of the variable does not 
// match the type of the assigned value:

// int greeting = "Hello World";
// The String "Hello World" cannot be held in a variable of type int.

// For the example above, we see an error in the console at compilation:

// error: incompatible types: String cannot be converted to int
//     int greeting = "Hello World";
// When bugs are not caught at compilation, they interrupt execution of the code 
// by causing runtime errors. The program will crash.

// Java’s static typing helps programmers avoid runtime errors, and thus have much 
// safer code that is free from bugs.


public class Mess {
	public static void main(String[] args) {   
		int year = 2001;
    String title = "Shrek";
    char genre = 'C';
    double runtime = 1.58;
    boolean isPG = true;
	}
}

// Output: none