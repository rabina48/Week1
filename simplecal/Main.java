package simplecal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select '+','-','*'");
        char c = sc.next().charAt(0);

        cal c1 = new cal();

        c1.getdata();


        if (c == '+') {
            c1.ad1();
        }

        else if (c == '-') {
            c1.sub();

        }

        else if (c == '*') {
            c1.mul();
        }

        else if (c == '/') {
            c1.div();
        }

        else{
            System.out.println("Invalid!");
        }

    }
}
