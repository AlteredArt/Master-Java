// Adding an Item
// Now we have an empty ArrayList, but how do we get it to store values?

// ArrayList comes with an add() method which inserts an element into the 
// structure. There are two ways we can use add().

// If we want to add an element to the end of the ArrayList, we’ll call 
// add() using only one argument that represents the value we are inserting. 
// In this example, we’ll add objects from the Car class to an ArrayList 
// called carShow:

// ArrayList<Car> carShow = new ArrayList<Car>();
 
// carShow.add(ferrari);
// // carShow now holds [ferrari]
// carShow.add(thunderbird);
// // carShow now holds [ferrari, thunderbird]
// carShow.add(volkswagen);
// // carShow now holds [ferrari, thunderbird, volkswagen]
// If we want to add an element at a specific index of our ArrayList, 
// we’ll need two arguments in our method call: the first argument will define 
// the index of the new element while the second argument defines the value of 
// the new element:

// // Insert object corvette at index 1
// carShow.add(1, corvette);
// // carShow now holds [ferrari, corvette, thunderbird, volkswagen]
 
// // Insert object porsche at index 2
// carShow.add(2, porsche);
// // carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]
// By inserting a value at a specified index, any elements that appear after 
// this new element will have their index value shift over by 1.

// Also, note that an error will occur if we try to insert a value at an index 
// that does not exist.

// Keep Reading: AP Computer Science A Students

// When using ArrayList methods (like add()), the reference parameters and return 
// type of a method must match the declared element type of the ArrayList. 
// For example, we cannot add an Integer type value to an ArrayList of String elements.

// We’ve discussed how to specify the element type of an ArrayList; however, it is 
// possible to create an ArrayList that holds values of different types.

// In the following snippet, assortment is an ArrayList that can store different 
// values because we do not specify its type during initialization.

// ArrayList assortment = new ArrayList<>();
// assortment.add("Hello"); // String
// assortment.add(12); // Integer
// assortment.add(ferrari); // reference to Car
// // assortment holds ["Hello", 12, ferrari]
// In this case, the items stored in this ArrayList will be considered Objects. 
// As a result, they won’t have access to some of their methods without doing some 
// fancy casting. Although this type of ArrayList is allowed, using an ArrayList that 
// specifies its type is preferred.


import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Go to store";
    String toDo3 = "Go to gym.";
    
    
    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    System.out.println(toDoList);
      
    
  }
  
}