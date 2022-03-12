Compilation: Catching Errors
Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler before it is executed by the Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

Steps of Java Compilation
Previous exercises have automatically compiled and run the files for you. Off-platform development environments can also compile and run files for you, but it’s important to understand this aspect of Java development so we’ll do it ourselves.

The compiling process catches mistakes before the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code that does not pass these checks will not be compiled.

This exercise will use an interactive terminal. Codecademy has a lesson on the command line if you’d like to learn more.

For example, with a file called Plankton.java, we could compile it with the terminal command:

javac Plankton.java
A successful compilation produces a .class file: Plankton.class, that we execute with the terminal command:

java Plankton
An unsuccessful compilation produces a list of errors. No .class file is made until the errors are corrected and the compile command is run again.

Instructions
1.
Let’s practice compiling and executing a file by entering commands in the terminal!

Our text editor contains a broken program so we can see how compilers help us catch mistakes. Don’t make any corrections!

In the terminal, type this command: javac Compiling.java and press enter or return.

Then click the Check Work button to check your work and move on to the next checkpoint.



public class Compiling {
  public static void main(String[] args) {
    
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.");

    System.out.println("Programming is... fun!");
    
  }
}



