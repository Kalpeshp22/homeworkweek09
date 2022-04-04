package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true){
            System.out.print("Enter the first number: ");
            int a = ob.nextInt();

            System.out.print("Enter the second number: ");
            int b = ob.nextInt();

            System.out.print("Enter the symbol: ");
            char symbol = ob.next().charAt(0);

            calc.calculateResult(a, b, symbol);

            System.out.println("Would you like to do more calculations? Please enter 'Y' or 'N'");
            char verify = ob.next().charAt(0);

            if (verify == 'N'){
                break;
            }
        }

    }
}

