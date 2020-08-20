package key.words;
        // Super Keyword
        //used to invoke immediate parent class method & constructor.


public class Animal {

    public void display(){
        System.out.println("Hello this is Animal");
    }
     static class Cat extends Animal{
        public  void display(){
            super.display();
            System.out.println("And Cat says meow ");

        }
     }

     public static  void main(String args[]){
        Animal an = new Cat();
        an.display();
     }
}
