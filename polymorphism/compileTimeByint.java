package polymorphism;

public class compileTimeByint {

    public static int add(int a, int b){
        System.out.println("sum three" + (10+20));
        return 10+20;
    }

    public int add(int a, int b, int c) {
        System.out.println("sum is "+(1+2+3));
        return 1+2+3;
    }
// class wise non static obj wise,
    // static is available form any where , it is directly

    // non static call garna call necessary

    public  static void main(String args[]) {
        compileTimeByint ob = new compileTimeByint();
         add(10,20); // accordin to need, no obj case,,
        ob.add(1,2,3);
        ob.add(10,20);






    }


}
