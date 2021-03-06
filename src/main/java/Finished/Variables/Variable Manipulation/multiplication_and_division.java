// Multiplication and Division

// Let’s say that our employer is calculating our paycheck and depositing it to 
// our bank account. We worked 40 hours last week, at a rate of $15.50 an hour. 
// Java can calculate this with the multiplication operator *:

// double paycheckAmount = 40 * 15.50;
// //paycheckAmount now holds 620.0
// If we want to see how many hours our total balance represents, we use the 
// division operator /:

// double balance = 20010.5;
// double hourlyRate = 15.5;
// double hoursWorked = balance / hourlyRate;
// //hoursWorked now holds 1291.0
// Division has different results with integers. The / operator does integer 
// division, which means that any remainder is lost.

// int evenlyDivided = 10 / 5;
// //evenlyDivided holds 2, because 10 divided by 5 is 2
// int unevenlyDivided = 10 / 4;
// //unevenlyDivided holds 2, because 10 divided by 4 is 2.5
// evenlyDivided stores what you expect, but unevenlyDivided holds 2 because 
// ints cannot store decimals! It’s important to note that the int doesn’t 
// round the decimal, but floors it. Java removes the 0.5 to fit the result 
// into an int type!

// It’s important to note that if we try to divide any number by 0, we will 
// get an ArithmeticException error as a result.

public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = (subtotal * tax) + subtotal;
    System.out.println(total);
    double perPerson = total / 4;
    System.out.println(perPerson);
	}
}

// Output: 32.625
// 8.15625
