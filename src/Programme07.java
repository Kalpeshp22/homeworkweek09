
// Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class Programme07 {
    public static void main(String[] args) {
        ArrayList<String>tubename = new ArrayList<>();

        tubename.add("Paddington");
        tubename.add("Acton Town");
        tubename.add("Charing Cross");
        tubename.add("Baker Street");
        tubename.add("Barbican");
        tubename.add(" Aldgate");

        System.out.println(" It's is empty or not : " + tubename.isEmpty());
        System.out.println(tubename.contains("Baker Street "));// True
        System.out.println(tubename.contains("Angel")); // False
    }

}
