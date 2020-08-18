package polymorphism;

public class methodOverloading {

    public void  mul(int a, int b){
        int total = a * b;
        System.out.println("Multiply of two no ="+total);

    }
    public void mul(double a, double b){
        double tot = a * b ;
        System.out.println("Mul is "+tot);


    }
    public static void main(String args[]){
        methodOverloading ob = new methodOverloading();
        ob.mul(10,20);
        ob.mul(2.2,2.3);

    }
}

