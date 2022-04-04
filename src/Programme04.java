//

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.

public class Programme04 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("White");
        list.add("Purple");
        list.add("Brown");

        for (String n: list) {
            System.out.println(n);

        }
    }

}

