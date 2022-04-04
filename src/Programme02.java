/*
2. Re write the student mark sheet programme using if else and while loop.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programme02 {

    public static void main(String[] args) {
        //Scanner declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name   \t \t: \t");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number  \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t;\t");
        int mathMarks = scanner.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("\nInvalid Input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct Marks \t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct Marks \t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //closing scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the results on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage > 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "_";
        }
        return grade;
    }

    // printing the Marks Sheett
    public static void printTheMarkSheet(String name, int rollNum, int mathMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {

        System.out.println("|---------------------------|");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|_________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                 |");
        System.out.println("|_________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|_________|");
        System.out.println("| Math:" + mathMarks + "                   |");

    }
}



