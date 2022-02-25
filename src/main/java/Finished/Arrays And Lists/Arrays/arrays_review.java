Review

We have now seen how to store a list of values in arrays. We can use this knowledge to make organized programs with more complex variables.

Throughout the lesson, we have learned about:

    Creating arrays explicitly, using { and }.
    Accessing an index of an array using [ and ].
    Creating empty arrays of a certain size, and filling the indices one by one.
    Getting the length of an array using length.
    Using the argument array args that is passed into the main() method of a class




    import java.util.Arrays;

public class Classroom {
  

  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;

    System.out.println("The number of students in the class is " + students.length);
  }
}


The number of students in the class is 4




