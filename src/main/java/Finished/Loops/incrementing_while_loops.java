Incrementing While Loops

When looping through code, it’s common to use a counter variable. A counter (also known as an iterator) is a variable used in the conditional logic of the loop and (usually) incremented in value during each iteration through the code. For example:

// counter is initialized
int wishes = 0;
 
// conditional logic uses counter
while (wishes < 3) {
 
  System.out.println("Wish granted.");
  // counter is incremented
  wishes++;
 
}

In the above example, the counter wishes gets initialized before the loop with a value of 0, then the program will keep printing "Wish granted." and adding 1 to wishes as long as wishes has a value of less than 3. Once wishes reaches a value of 3 or more, the program will exit the loop.

So the output would look like:

Wish granted.
Wish granted.
Wish granted.

We can also decrement counters like this:

int pushupsToDo = 10;
 
while (pushupsToDo > 0) {
 
  doPushup();
  pushupsToDo--;
 
}

In the code above, the counter, pushupsToDo, starts at 10, and increments down one at a time. When it hits 0, the loop exits.





class Coffee {
  
    public static void main(String[] args) {
      
      // initialize cupsOfCoffee
      int cupsOfCoffee = 1;
      // add while loop with counter
      while (cupsOfCoffee <= 100){
          System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        cupsOfCoffee++;
      
      }
          
      
    }
    
  }


  Fry drinks cup of coffee #1
Fry drinks cup of coffee #2
Fry drinks cup of coffee #3
Fry drinks cup of coffee #4
Fry drinks cup of coffee #5
Fry drinks cup of coffee #6
Fry drinks cup of coffee #7
Fry drinks cup of coffee #8
Fry drinks cup of coffee #9
Fry drinks cup of coffee #10
Fry drinks cup of coffee #11
Fry drinks cup of coffee #12
Fry drinks cup of coffee #13
Fry drinks cup of coffee #14
Fry drinks cup of coffee #15
Fry drinks cup of coffee #16
Fry drinks cup of coffee #17
Fry drinks cup of coffee #18
Fry drinks cup of coffee #19
Fry drinks cup of coffee #20
Fry drinks cup of coffee #21
Fry drinks cup of coffee #22
Fry drinks cup of coffee #23
Fry drinks cup of coffee #24
Fry drinks cup of coffee #25
Fry drinks cup of coffee #26
Fry drinks cup of coffee #27
Fry drinks cup of coffee #28
Fry drinks cup of coffee #29
Fry drinks cup of coffee #30
Fry drinks cup of coffee #31
Fry drinks cup of coffee #32
Fry drinks cup of coffee #33
Fry drinks cup of coffee #34
Fry drinks cup of coffee #35
Fry drinks cup of coffee #36
Fry drinks cup of coffee #37
Fry drinks cup of coffee #38
Fry drinks cup of coffee #39
Fry drinks cup of coffee #40
Fry drinks cup of coffee #41
Fry drinks cup of coffee #42
Fry drinks cup of coffee #43
Fry drinks cup of coffee #44
Fry drinks cup of coffee #45
Fry drinks cup of coffee #46
Fry drinks cup of coffee #47
Fry drinks cup of coffee #48
Fry drinks cup of coffee #49
Fry drinks cup of coffee #50
Fry drinks cup of coffee #51
Fry drinks cup of coffee #52
Fry drinks cup of coffee #53
Fry drinks cup of coffee #54
Fry drinks cup of coffee #55
Fry drinks cup of coffee #56
Fry drinks cup of coffee #57
Fry drinks cup of coffee #58
Fry drinks cup of coffee #59
Fry drinks cup of coffee #60
Fry drinks cup of coffee #61
Fry drinks cup of coffee #62
Fry drinks cup of coffee #63
Fry drinks cup of coffee #64
Fry drinks cup of coffee #65
Fry drinks cup of coffee #66
Fry drinks cup of coffee #67
Fry drinks cup of coffee #68
Fry drinks cup of coffee #69
Fry drinks cup of coffee #70
Fry drinks cup of coffee #71
Fry drinks cup of coffee #72
Fry drinks cup of coffee #73
Fry drinks cup of coffee #74
Fry drinks cup of coffee #75
Fry drinks cup of coffee #76
Fry drinks cup of coffee #77
Fry drinks cup of coffee #78
Fry drinks cup of coffee #79
Fry drinks cup of coffee #80
Fry drinks cup of coffee #81
Fry drinks cup of coffee #82
Fry drinks cup of coffee #83
Fry drinks cup of coffee #84
Fry drinks cup of coffee #85
Fry drinks cup of coffee #86
Fry drinks cup of coffee #87
Fry drinks cup of coffee #88
Fry drinks cup of coffee #89
Fry drinks cup of coffee #90
Fry drinks cup of coffee #91
Fry drinks cup of coffee #92
Fry drinks cup of coffee #93
Fry drinks cup of coffee #94
Fry drinks cup of coffee #95