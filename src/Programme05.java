
//  Write a Java program to iterate through all elements in an array list using
//Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Programme05 {

    public static void main(String[] args) {
        // creating an Arraylist

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Lexus");
        cars.add("Honda");
        cars.add("Tesla");

        System.out.println(" Arraylist : "+cars);

        // Creating an instance of List using Intrator
        System.out.println("n/nIerator:");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }


}
