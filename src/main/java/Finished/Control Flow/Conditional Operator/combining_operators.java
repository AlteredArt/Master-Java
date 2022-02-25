Combining Conditional Operators

We have the ability to expand our boolean expressions by using multiple conditional operators in a single expression.

For example:

boolean foo = true && !(false || !true)

How does an expression like this get evaluated by the compiler? The order of evaluation when it comes to conditional operators is as follows:

    Conditions placed in parentheses - ()
    NOT - !
    AND - &&
    OR - ||

Using this information, let’s dissect the expression above to find the value of foo:

true && !(false || !true)

First, we’ll evaluate (false || !true) because it is enclosed within parentheses. Following the order of evaluation, we will evaluate !true, which equals false:

true && !(false || false)

Then, we’ll evaluate (false || false) which equals false. Now our expression looks like this:

true && !false

Next, we’ll evaluate !false because it uses the NOT operator. This expression equals true making our expression the following:

true && true

true && true evaluates to true; therefore, the value of foo is true.





public class Operators {
    public static void main(String[] args) {
      int a = 6;
      int b = 3;
  
      boolean ex1 = !(a == 7 && (b >= a || a != a));
      System.out.println(ex1);
  
      boolean ex2 = a == b || !(b > 3);
      System.out.println(ex2);
  
      boolean ex3 = !(b <= a && b != a + b);
      // System.out.println(ex3); 
  
    }
  }




  true
true
