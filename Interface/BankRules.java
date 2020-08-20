package Interface;
            //looks like a class but it is not a class
//  can have methods and variables just like the class
//  but the methods declared in interface are by default abstract
// Use for full abstraction
//an interface can not implement another interface. It has to extend the other interface.
//class needs to implement them before they access it.

import java.util.Scanner;

interface Bank {

     abstract  void getLoan();

}
    class Department implements Bank {
      String  firstName;
      String  lastName;
      String address;
      double loan;
      double amount;



        public void getLoan() {
            System.out.println("Please add your Information if you want to get loan:");
            Scanner information = new Scanner(System.in);

            System.out.println("Enter your first name:");
            firstName = information.nextLine();

            System.out.println("Enter your last name:");
            lastName =information.nextLine();

            System.out.println("Enter your current Address:");
            address =  information.nextLine();

            System.out.println("Enter how much you want to loan you want:");
            loan = information.nextDouble();

            double amount = information.nextDouble();



        }
         public void getLoanAmount(){

            if(amount <= 100000){
                System.out.println("you can take loan");
            }
        }


    }
        class Department1 implements Bank {

            public void getLoan(){
                System.out.println("We are providing 10% interest for Loan above 1Lakh");

            }


   }
