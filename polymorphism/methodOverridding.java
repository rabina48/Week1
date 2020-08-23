package polymorphism;

// Base class
public class methodOverridding {
    public void show() {
        System.out.println("This is parent class ");
    }


    public static void main(String args[]) {
        methodOverridding ob = new child();
        ob.show();
    }
}

class child extends methodOverridding {

    public void show() {
        System.out.println("This is child class");
    }
}


