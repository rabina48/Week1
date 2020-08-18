package polymorphism;

public class compileTimeByint {

    public int add(int a, int b){

        return 10+20;
    }

    public int add(int a, int b, int c) {
        return 1+2+3;
    }

    public  static void main(String args[]) {
        System.out.println("sum three" + (10+20));
        System.out.println("sum is "+(1+2+3));


    }


}
