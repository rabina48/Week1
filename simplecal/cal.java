package simplecal;



import java.util.Scanner;

public class cal {

    double n1, n2;
    char op;

    public void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two num;");
        n1 = s.nextDouble();
        n2 = s.nextDouble();

    }

    public void ad1() {
        double output = n1 + n2;
        System.out.println(output);

    }
    public void sub() {
        double output = n1- n2;
        System.out.println(output);

    }
    public void mul() {
        double output = n1 * n2;
        System.out.println(output);

    }
    public void div() {
        double output = n1 / n2;
        System.out.println(output);

    }



 }

