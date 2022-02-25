// Get Element By Index
// Now that we have an array declared and initialized, we want to 
// be able to get values out of it.

// We use square brackets, [ and ], to access data at a certain index:

// double[] prices = {13.1, 15.87, 14.22, 16.66};
 
// System.out.println(prices[1]);
// This command would print:

// 15.87
// This happens because 15.87 is the item at the 1 index of the array. 
// Remember, the index of an array starts at 0 and ends at an index 
// of one less than the number of elements in the array.

// If we try to access an element outside of its appropriate index 
// range, we will receive an ArrayIndexOutOfBoundsException error.

// For example, if we were to run the command System.out.println(prices[5]), 
// we’d get the following output:

// java.lang.ArrayIndexOutOfBoundsException: 5



import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}



The top topic is Opinion
The Tech topic has been viewed 3 times!