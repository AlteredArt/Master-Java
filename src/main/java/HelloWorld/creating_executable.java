Compilation: Creating Executables
Compilation helped us catch an error. Now that we’ve corrected the file, let’s walk through a successful compilation.

As a reminder, we can compile a .java file from the terminal with the command:

javac Whales.java
If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.

We run the executable with the command:

java Whales
Note that we leave off the .class part of the filename.

Here’s a full compilation cycle as an example:

// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
We have one file: Welcome.java. We compile with the command:

javac Welcome.java
The terminal shows no errors, which indicates a successful compilation.

We now have two files:

Welcome.java, our original file with Java syntax.
Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.
We can execute the compiled class with the command:

java Welcome
The following is printed to the screen:

Welcome to Codecademy's Java course!



public class Compiling {
  public static void main(String[] args) {
    
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.");

    System.out.println("Programming is... fun!");
    
  }
}



