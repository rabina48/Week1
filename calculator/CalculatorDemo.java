package calculator;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two number:");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            //charAt(0). next()  returns the next token/word in the
        // input as a string and charAt(0) function returns the first character in that string.

        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;


            default:
                System.out.println("wrong operator");
                return;
        }

        System.out.println("The result is ="+output);
    }
}
