Creating an Array Explicitly

Imagine that we’re using a program to keep track of the prices of different clothing items we want to buy. We would want a list of the prices and a list of the items they correspond to. To create an array, we first declare the type of data it holds:

double[] prices;

Then, we can explicitly initialize the array to contain the data we want to store:

 prices = {13.15, 15.87, 14.22, 16.66};

Just like with simple variables, we can declare and initialize in the same line:

double[] prices = {13.15, 15.87, 14.22, 16.66};

We can use arrays to hold Strings and other objects as well as primitives:

String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};




public class Newsfeed {
  
  
    public Newsfeed(){
      
    }
    
    // Create getTopics() below:
    public String[] getTopics(){
      String [] topics = {"Opinion", "Tech", "Science", "Health"};
      return topics;
    }
  
    public static void main(String[] args){
      Newsfeed sampleFeed = new Newsfeed();
      
      String[] topics = sampleFeed.getTopics();
      System.out.println(topics);
      
    }
  }

  Output-only Terminal
Output:

[Ljava.lang.String;@2aae9190
  