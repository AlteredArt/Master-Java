// Changing a Value
// When we were using arrays, we could rewrite entries by using bracket 
// notation to reassign values:

// String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};
 
// shoppingCart[0] = "Tweed Cape";
 
// // shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
// ArrayList has a slightly different way of doing this, using the set() method:

// ArrayList<String> shoppingCart = new ArrayList<String>();
 
// shoppingCart.add("Trench Coat");
// shoppingCart.add("Tweed Houndstooth Hat");
// shoppingCart.add("Magnifying Glass");
 
// shoppingCart.set(0, "Tweed Cape");
 
// // shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

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
    
    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}



Sherlock's to-do list:
[visit the crime scene, listen to Dr. Watson for amusement, interview suspects, solve the case, apprehend the criminal]

Poirot's to-do list:
[visit the crime scene, interview suspects, let the little grey cells do their work, listen to Captain Hastings for amusement, call all suspects together, reveal the truth of the crime]