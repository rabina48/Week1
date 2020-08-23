package calculatorr.using.function;

import calculator.Calculator;
//pre define kura concrete

import java.util.Scanner;

public class SimpleCalculator {

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2){
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        return n1 / n2;
    }


    public Input getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two value to calculate:");
       double n1 = sc.nextDouble();
       double n2 = sc.nextDouble();
        System.out.println("Enter any operator( + , - ,* , /)");
        char operator = sc.next().charAt(0);

        Input in = new Input(n1, n2, operator);

        return in;

    }


    public double calculate(double n1,double n2,char operator) throws RuntimeException {
        switch (operator) {
            case '+':
                return add(n1, n2);
            case '-':
                return sub(n1,n2);
            case '*':
                return mul(n1, n2);
            case '/':
                return div(n1, n2);
            default:
                throw new RuntimeException("Unknown operation");
        }
    }


    public void displayResult(double result){
        System.out.println("Result: "+ result);
    }


}






