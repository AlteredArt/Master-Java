// Modulo

// If we baked 10 cookies and gave them out in batches of 3, how many would 
// we have leftover after giving out all the full batches we could?

// The modulo operator %, gives us the remainder after two numbers are divided.

// int cookiesBaked = 10;
// int cookiesLeftover = 10 % 3;
// //cookiesLeftover holds 1
// You have 1 cookie left after giving out all the batches of 3 you could!

// Modulo can be a tricky concept, so let’s try another example.

// Imagine we need to know whether a number is even or odd. An even number is 
// divisible by 2.

// Modulo can help! Dividing an even number by 2 will have a remainder of 0. 
// Dividing an odd number by 2 will have a remainder of 1.

// 7 % 2
// // 1, odd!
// 8 % 2
// // 0, even!
// 9 % 2
// // 1, odd!

public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
    int leftOut = students % 3;
    System.out.println(leftOut);
	}
}

public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
    int leftOut = students % 3;
    System.out.println(leftOut);
	}
}

// Output: 2