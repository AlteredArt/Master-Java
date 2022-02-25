// Removing an Item
// What if we wanted to get rid of an entry altogether? For arrays, we 
// would have to make a completely new array without the value.

// Luckily, ArrayLists allow us to remove an item by specifying the 
// index to remove:

// ArrayList<String> shoppingCart = new ArrayList<String>();
 
// shoppingCart.add("Trench Coat");
// shoppingCart.add("Tweed Houndstooth Hat");
// shoppingCart.add("Magnifying Glass");
 
// shoppingCart.remove(1);
// // shoppingCart now holds ["Trench Coat", "Magnifying Glass"]
// We can also remove an item by specifying the value to remove:

// ArrayList<String> shoppingCart = new ArrayList<String>();
 
// shoppingCart.add("Trench Coat");
// shoppingCart.add("Tweed Houndstooth Hat");
// shoppingCart.add("Magnifying Glass");
 
// shoppingCart.remove("Trench Coat");
// // shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]
// Note: This command removes the FIRST instance of the value "Trench Coat".

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
    
    // Remove each to-do below:
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);
    sherlocksToDos.remove(0);

    
    
      
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());
  }
  
}




[interview suspects, solve the case, apprehend the criminal]

[interview suspects, let the little grey cells do their work, trim mustache, call all suspects together, reveal the truth of the crime]