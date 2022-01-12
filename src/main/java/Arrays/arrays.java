// Importing Arrays
// When we printed out the array we created in the last exercise, 
// we saw a memory address that did not help us understand what 
// was contained in the array.

// If we want to have a more descriptive printout of the array 
// itself, we need a toString() method that is provided by the 
// Arrays package in Java.

// import java.util.Arrays;
// We put this at the top of the file, before we even define 
// the class!

// When we import a package in Java, we are making all of the 
// methods of that package available in our code.

// The Arrays package has many useful methods, including 
// Arrays.toString(). When we pass an array into 
// Arrays.toString(), we can see the contents of the array printed out:
// import the Arrays package here:
import java.util.Arrays;

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    System.out.println(Arrays.toString(topics));
  }
}
