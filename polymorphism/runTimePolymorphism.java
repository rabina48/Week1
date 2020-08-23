package polymorphism;

public class runTimePolymorphism {
    public void run() {

        System.out.println("Hi this is parent");
    }
}

      class childs extends  runTimePolymorphism{
    public void run(){

        System.out.println("hi this is child");
    }
    public static void main(String args[]){
        runTimePolymorphism obj = new childs(); // dynamic binding
        obj.run();
        runTimePolymorphism obj1 = new runTimePolymorphism();
        obj1.run();
    }
}
