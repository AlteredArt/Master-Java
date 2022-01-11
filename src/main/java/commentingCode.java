// When comments are short we use the single-line syntax: //.

// When comments are long we use the multi-line syntax: /* and */.

/*
We chose to store information across multiple databases to
minimize the possibility of data loss. We'll need to be careful
to make sure it does not go out of sync!
*/


// Another type of commenting option is the Javadoc comment which is 
// represented by /** and */. Javadoc comments are used to create 
// documentation for APIs (Application Programming Interfaces). When 
// writing Javadoc comments, remember that they will eventually be 
// used in the documentation that your users might read, so make 
// sure to be especially thoughtful when writing these comments.

// Javadoc comments are typically written before the declaration of 
// fields, methods, and classes.

/**
* The following class accomplishes the following task...
*/

/**
* The following class shows what a comment would look like in a program.
*/
public class CommentExample {
  // I'm a comment inside the class
  public static void main(String[] args) {
    // I'm a comment inside a method
    System.out.println("This program has comments!");
  }
}