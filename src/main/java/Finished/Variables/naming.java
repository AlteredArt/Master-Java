// Naming
// Let’s imagine we’re storing a user’s name for their profile. Which code 
// example do you think is better?

// String data = "Delilah";
// or

// String nameOfUser = "Delilah";
// While both of these will compile, the second example is much easier to 
// understand. Readers of the code will know the purpose of the value: "Delilah".

// Naming variables according to convention leads to clear, readable, and 
// maintainable code. When someone else, or our future self, reads the code, 
// there is no confusion about the purpose of a variable.

// In Java, variable names are case-sensitive. myHeight is a different variable 
// from myheight. The length of a variable name is unlimited, but we should keep 
// it concise while keeping the meaning clear.

// A variable starts with a valid letter, or a $, or a _. No other symbols or 
// numbers can begin a variable name. 1stPlace and *Gazer are not valid variable 
// names.

// Variable names of only one word are spelled in all lowercase letters. Variable 
// names of more than one word have the first letter lowercase while the beginning 
// letter of each subsequent word is capitalized. This style of capitalization is 
// called camelCase.

// // good style
// boolean isHuman;
 
// // bad styles
// // no capitalization for new word
// boolean ishuman;
// // first word should be lowercase
// boolean IsHuman;
// // underscores don't separate words
// boolean is_human;

public class BadNames {
	public static void main(String[] args) {   
		String firstName = "Samira";
    String blah = "Smith";
    String dotCom = "samira@google.com";
    int salaryexpectation = 100000;
    int year_of_birth = 1955;
    
    System.out.println("The program runs!");
	}
}

// Output: The program runs!
