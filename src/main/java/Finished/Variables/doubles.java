// doubles

// Whole numbers don’t accomplish what we need for every program. What if we 
// wanted to store the price of something? We need a decimal point. What if 
// we wanted to store the world’s population? That number would be larger 
// than the int type can hold.

// The double primitive data type can help. double can hold decimals as well 
// as very large and very small numbers. The maximum value is 
// 1.797,693,134,862,315,7 E+308, which is approximately 17 followed by 307 
// zeros. The minimum value is 4.9 E-324, which is 324 decimal places!

// To declare a variable of type double, we use the double keyword in the 
// declaration:

// // doubles can have decimal places:
// double price = 8.99;
// // doubles can have values bigger than what an int could hold:
// double gdp = 12237700000;

public class MarketShare {
	public static void main(String[] args) {
    double androidShare = 81.7;
    System.out.println(androidShare);
	}
}

// Output: 81.7