// Introduction

// Let’s say we are writing a program that represents a user’s bank account. 
// With variables, we know how to store a balance! We’d use a double, the 
// primitive type that can hold big decimal numbers. But how would we deposit 
// and withdraw from the account?

// Lucky for us, we have the ability to manipulate the value of our variables. 
// We can use expressions, arithmetic operators, and more in order to change 
// our variables’ values.

// For example, Java has built-in arithmetic operations that perform calculations 
// on numeric values:

// // declare initial balance
// double balance = 20000.99;
// // declare deposit amount
// double depositAmount = 1000.00;
// // store result of calculation in our original variable
// balance = balance + depositAmount;
// In the final line of the code above, we used the expression balance + 
// depositAmount to determine the new value of the balance variable. When an 
// expression is executed, it produces a single value.

// The data type of a variable plays a large role in the operations we can use to 
// manipulate it. We can think of a data type as a combination of a set of values, 
// and a set of operations on those values. For example, the double data type is 
// comprised of values like 4.8 and operations like addition (+). For now, we’ll 
// mainly focus on the set of operations that can be used on numbers and booleans.

// The data type of an expression is determined by the resulting value. For 
// example, an expression that uses two int values will evaluate to an int value. 
// If an expression contains a double value, then the resulting value will also 
// be type double.

// Throughout this lesson, we will learn how to manipulate variables of different 
// data types.


public class GuessingGame {
	public static void main(String[] args) {   
		int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}


// Output: 2