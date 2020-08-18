package calculator;

import java.util.Scanner;

//create a calculator application
// that accepts two integer from user
// and chooses one of the four operations
// (add, subtract, multiplication and division ) and display the result of those opertaions in console
public class Calculator {
     public static void main(String[] args){

    double n1, n2 , ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
         n1 = sc.nextDouble();
         n2 = sc.nextDouble();

         System.out.println("Which operator do you Prefer (add , sub, mul, div)");

      String str = sc.nextLine();
          sc.close();


         switch (str) {
             case "add":
                 ans = n1 + n2;
                 break;

             case "sub":
                 ans = n1 - n2;
                 break;

             case "mul":
                 ans = n1 * n2;
                 break;

             case "div":
                 ans = n1 / n2;
                 break;

             default:
                 System.out.println("input not found *");
                 return;
         }
                 System.out.println("The result is ="+ans);

         }

    }


