package AbstractClass;

import java.util.Scanner;

abstract public class Office {
     void getPayment(){
         System.out.println("Salary will be increasing .25% annually");

     }
     abstract public void salary(int a, float b);
}
class Employee extends Office{
     String name;
     int id;
     String address;
     long salary;
     double rate;

    public void   salary(int a, float b){
        this.salary = a;
        this.rate = b;
        double total= a + (a * b);

        System.out.println("The salary per month is ="+total);
     }

     public  void getPayment(){
         Scanner sr = new Scanner(System.in);
         System.out.println("Enter your First and LAST name:");
         String str1 = sr.nextLine();
         System.out.println("Enter your DEPARTMENT name:");
         String str = sr.nextLine();


      if (str.equals("Developer") | str.equals("Designer ")){
          System.out.println("Salary increase 0.25% semiannually");

      }
      else {
          System.out.println("Next year you will have a increament");

      }
     }


      }




