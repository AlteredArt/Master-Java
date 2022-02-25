Introduction

In the last lesson, we learned that objects have state and behavior. We have seen how to give objects state through instance fields. Now, we’re going to learn how to create object behavior using methods. Remember our example of a Savings Account.
A diagram of a software object with fields and behavior

The state tells us what a savings account should know:

    The balance of money available

The behavior tells us what tasks a savings account should be able to perform:

    Depositing - increasing the amount available
    Withdrawing - decreasing the amount available
    Checking the balance - displaying the amount available.

Methods are repeatable, modular blocks of code used to accomplish specific tasks. We have the ability to define our own methods that will take input, do something with it, and return the kind of output we want.

Looking at the example above, recreating a savings account is no easy task. How can one program tackle such a large problem? This is where methods and their ability to accomplish smaller, specific tasks comes in handy. Through method decomposition, we can use methods to break down a large problem into smaller, more manageable problems.

Methods are so reusable. Imagine we wrote a sandwich-making program that used 20 lines of code to make a single sandwich. Our program would become very long very quickly if we were making multiple sandwiches. By creating a makeSandwich() method, we can make a sandwich anytime simply by calling it.
makeSandwich() adds ingredients together to make a sandwich

In this lesson, we’ll learn how to create and call our very own methods inside of our programs.

Keep Reading: AP Computer Science A Students

If we were to share this sandwich-making program with another person, they wouldn’t have to understand how makeSandwich() worked. If we wrote our program well, all they would need to know is that if they called makeSandwich(), they would receive a sandwich. This concept is known as procedural abstraction: knowing what a method does, but not how it accomplishes it.



public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Withdrawing:
      int afterWithdraw = savings.balance - 300;
      savings.balance = afterWithdraw;
      System.out.println("You just withdrew "+300);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit = savings.balance + 600;
      savings.balance = afterDeposit;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit2 = savings.balance + 600;
      savings.balance = afterDeposit2;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
    }       
  }
  



  Hello!
Your balance is 2000
You just withdrew 300
Hello!
Your balance is 1700
You just deposited 600
Hello!
Your balance is 2300
You just deposited 600
Hello!
Your balance is 2900