package calculatorr.using.function;

import calculator.Calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void add(double n1, double n2) {
        double ad = n1 + n2;
        System.out.println(ad);
    }

    public void sub(double n1, double n2) {
        double sb = n1 - n2;
        System.out.println(sb);
    }

    public void mul(double n1, double n2) {
        double ml = n1 * n2;
        System.out.println(ml);
    }

    public void div(double n1, double n2) {
        double dv = n1 / n2;
        System.out.println(dv);
    }






        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any two value to calculate:");
             double n1 = sc.nextDouble();
             double n2 = sc.nextDouble();

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter any operator( + , - ,* , /)");
            char operator = sc1.next().charAt(0);
            double output;
            SimpleCalculator s1= new SimpleCalculator();

            if (operator == '+') {

                s1.add(n1, n2);

            }
            if (operator == '-') {

                s1.sub(n1, n2);

            }
            if (operator == '*') {

                s1.mul(n1, n2);

            }
            if (operator == '/') {

                s1.div(n1, n2);

            }





        }
    }







