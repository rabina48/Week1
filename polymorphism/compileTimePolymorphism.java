package polymorphism;

public class compileTimePolymorphism {


    public void eat() {
        System.out.println("This is CompileTimePoly,");
    }

    public void eat(String name) {
        System.out.println("Her name is "+name);
    }



        public static void main(String[] args) {
            compileTimePolymorphism animal = new compileTimePolymorphism();
            animal.eat();
            animal.eat("Rabina");
        }
    }

    // using void methodOverloading



