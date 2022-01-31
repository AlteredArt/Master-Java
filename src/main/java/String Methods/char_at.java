// charAt()

// The charAt() method returns the character located at a String‘s 
// specified index.

// For example:

// String str = "qwer";
 
// System.out.println(str.charAt(2));
// It would output e because that’s what’s at index 2. (Once again, 
// indices start with 0.)

// Suppose we try to return the character located at index 4. 
// It would produce an IndexOutOfBoundsException error because index 4 
// is out of str‘s range:

// java.lang.StringIndexOutOfBoundsException: String index out of range: 4

public class Initials {
  
	public static void main(String[] args) {
    
    // Add a first name and a last name:
    String firstName = "waffles";  
    String lastName = "matta";
    
    // What are the initials?
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));

    
  }
  
}