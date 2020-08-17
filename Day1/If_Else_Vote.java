package Day1;

import java.util.Scanner;

public class If_Else_Vote {
    public static  void main(String args[]){

//    int num1, num2, sum;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter First Number: ");
//    num1 = sc.nextInt();
//
//    Scanner sc1 = new Scanner(System.in);
//    System.out.println("Enter the second Number");
//    num2 = sc1.nextInt();
//
//    sum = num1 + num2;
//    System.out.println("sum of two num is = " +sum);

        int age;
        String name;
        String Vote;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        age = sc.nextInt();

        if(age>=18){
            System.out.println("You can vote,");

            Scanner sc1 = new Scanner(System.in);
            System.out.println(" Please enter your name=");
            name = sc1.next();


            Scanner sc2 = new Scanner(System.in);
            System.out.println(" Vote any one = java , python , Ruby");
            Vote = sc2.next();

            }
//            if( Vote == "Ruby","java","python"){
//                System.out.println("Your vote is Recorded");
//               } else{
//                 System.out.println("Invalid!");
//             }

//        else(age< 18){
//            System.out.println("you cannot vote");
//        }





        }

}



