package polymorphism;
 // Base class
public class methodOverridding {
    public void show() {
        System.out.println("This is parent class ");
    }
}

    class child extends  methodOverloading {

        public void show() {
            System.out.println("This is child class");
        }



        public  static  void main(String args[]){
        methodOverloading ob = new child();
        ob.show();
        }
    }


