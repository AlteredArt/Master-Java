As you may recall, a String, which is widely used in Java, 
is an object that represents a sequence of characters. It is a 
great way to store information.

Because character strings are so vital to programming, Java 
dedicated an entire class to them. This is great news for us 
because the String class has a lot of useful methods to help 
us perform operations on Strings and data manipulation. We don’t 
have to import anything to use the String class because it’s 
part of the java.lang package which is available by default.

In this lesson, we will go over several String methods:

length()
concat()
equals()
indexOf()
charAt()
substring()
toUpperCase() / toLowerCase()
Let’s get started!

public class HelloWorld {
  
	public static void main(String[] args) {
    
    String str = "Hello, World!";
    
    // Examples:

    System.out.println(str.length());
    
    System.out.println(str.substring(4));
    
    System.out.println(str.toUpperCase());
    
  }
  
}


public class TweetCounter {
  
	public static void main(String[] args) {
    
    String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";  

    // What's the character count?
    
    System.out.println(tweet.length());
  }
  
}



public class CombineNames {
  
	public static void main(String[] args) {
    
    // Add your first names:
    String firstName = "Ziggy";  
    String lastName = "Stardust";

    // What's the full name?
    System.out.println(firstName.concat(" " + lastName));
    
  }
  
}