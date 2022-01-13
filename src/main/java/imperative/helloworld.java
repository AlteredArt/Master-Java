// Hello World

// Java is a compiled programming language, meaning the code we 
// write in a .java file is transformed into byte code by a 
// compiler before it is executed by the Java Virtual Machine 
// on your computer.

For example, with a file called Plankton.java, we could compile 
it with the terminal command:
javac Plankton.java

A successful compilation produces a .class file: Plankton.class, 
that we execute with the terminal command:
java Plankton

An unsuccessful compilation produces a list of errors. No .class 
file is made until the errors are corrected and the compile 
command is run again.

If the file compiles successfully, this command produces an 
executable class: FileName.class. Executable means we can run 
this program from the terminal.
We run the executable with the command:

java Whales

We can execute the compiled class with the command:
java Welcome
The following is printed to the screen:
Welcome to Codecademy's Java course!

// String[] args is a placeholder for information we want to 
// pass into our program. This syntax is necessary for the 
// program to run but more advanced than we need to explore 
// at the moment.

// Print statements output information to the screen (also 
// referred to as the output terminal)

// System is a built-in Java class that contains useful tools for our programs.
// out is short for “output”.
// println is short for “print line”.

// We also can output information using System.out.print(). Notice that we’re 
// using print(), not println(). Unlike System.out.println(), this type of print 
// statement outputs everything on the same line.

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}