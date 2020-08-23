package dayone;

import java.util.Scanner;

public class Add_Fivenum_For {

    public static void main(String args[]){

        int n,num, sum=0, avg;

        System.out.println("Enter num for calculation:");

        for(n=0; n<=4; n++) {
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            sum = sum + num;
        }
        avg = sum/n;
        System.out.println("The sum of num is"+sum+"\n The average num is "+avg);
        }
    }

