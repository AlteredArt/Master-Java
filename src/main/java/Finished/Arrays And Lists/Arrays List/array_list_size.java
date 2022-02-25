// ArrayList Size
// Let’s say we have an ArrayList that stores items in a user’s 
// online shopping cart. As the user navigates through the site 
// and adds items, their cart grows bigger and bigger.

// If we wanted to display the number of items in the cart, we 
// could find the size of it using the size() method:

// ArrayList<String> shoppingCart = new ArrayList<String>();
 
// shoppingCart.add("Trench Coat");
// System.out.println(shoppingCart.size());
// // 1 is printed
// shoppingCart.add("Tweed Houndstooth Hat");
// System.out.println(shoppingCart.size());
// // 2 is printed
// shoppingCart.add("Magnifying Glass");
// System.out.println(shoppingCart.size());
// // 3 is printed
// In dynamic objects like ArrayLists, it’s important to know 
// how to access the amount of objects we have stored.

import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());

      
    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirots");
    
  }
  
}



5
6
Poirots