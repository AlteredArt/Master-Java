// Length
// What if we have an array storing all the usernames for our program, and 
// we want to quickly see how many users we have? To get the length of an 
// array, we can access the length field of the array object:

// String[] menuItems = new String[5];
// System.out.println(menuItems.length);
// This command would print 5, since the menuItems array has 5 slots, even 
// though they are all empty.

// If we print out the length of the prices array:

// double[] prices = {13.1, 15.87, 14.22, 16.66};
 
// System.out.println(prices.length);
// We would see 4, since there are four items in the prices array!
import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    return topics.length;
  }
  
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}


Output-only Terminal
Output:

The number of topics is 4