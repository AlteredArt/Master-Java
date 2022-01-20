// What are Access and Scope?

// As our Java programs begin to get bigger and we begin to have 
// multiple Objects and Classes that interact with each other, 
// the concepts of access and scope come into play. To oversimplify 
// things, the concepts of access and scope both center around what 
// parts of your programs can interact with specific variables or 
// methods from other parts of your program. Let’s take a brief 
// look at some of the concepts we’ll cover:

// Access

// The public and private keywords and how they relate to Classes, 
// variables, constructors, and methods
// The concept of encapsulation
// Accessor methods, sometimes known as “getters”
// Mutator methods, sometimes known as “setters”
// Scope

// Local variables vs. instance variables
// The this keyword
// Let’s get started!

// Instructions
// For now, let’s get a preview of how access works in Java. In the 
// code editor, you should see two files - Bank.java and CheckingAccount.java. 
// Take a look at each file and notice the instance variables are declared 
// using the private keyword. When you’re ready, select the Bank.java file, 
// and run your code.

// You should get two errors! Take a look at the main() method in Bank.java. 
// Our Bank is trying to access some instance variables from a CheckingAccount 
// that is marked as private! Take a look at the error message to see which 
// variables are giving us trouble.
public class CheckingAccount{
  public String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  public void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  public void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

}



public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name);
    bankOfGods.accountOne.addFunds(5);
    bankOfGods.accountOne.getInfo();

  }

}


// Output:
// Zeus
// This checking account belongs to Zeus. It has 105 dollars in it.
