// Other Private Methods

// Now that we’ve seen how methods can call other methods using this., let’s 
// look at a situation where you might want to use private methods. Oftentimes, 
// private methods are helper methods — that is to say that they’re methods 
// that other, bigger methods use.

// For example, for our CheckingAccount example, we might want a public method 
// like getAccountInformation() that prints information like the name of the 
// account owner, the amount of money in the account, and the amount of interest 
// the account will make in a month. That way, another class, like a Bank, could 
// call that public method to get all of that information quickly.

// Well, in order to get that information, we might want to break that larger 
// method into several helper methods. For example, inside getAccountInformation(), 
// we might want to call a function called calculateNextMonthInterest(). 
// That helper method should probably be private. There’s no need for a Bank to 
// call these smaller helper methods — instead, a Bank can call the one public 
// method, and rely on that method to do all of the complicated work by calling 
// smaller private methods.

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

  }

  private int getBalance(){
    return this.balance;
  }

  // Write the calculateNextMonthInterest() here
  private double calculateNextMonthInterest(){
    return this.interestRate * this.balance;
  }

}

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    this.accountOne = new CheckingAccount("Zeus", 100, "1");
    this.accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    bankOfGods.accountOne.getAccountInformation();
    bankOfGods.accountOne.calculateNextMonthInterest();
  }

}