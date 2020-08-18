package polymorphism;

public class runTimePolymorphism {
    public void run() {

        System.out.println("Hi this is parent");
    }
}

      class child extends  runTimePolymorphism{
    public void run(){

        System.out.println("hi this is child");
    }
    public static void main(String args[]){
        runTimePolymorphism obj = new child();
        obj.run();
        runTimePolymorphism obj1 = new runTimePolymorphism();
        obj1.run();
    }
}
