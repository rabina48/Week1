package constructor.examples;
     //constructor overloading constructor is just like a method but without return type
//Constructor overloading in Java is a technique of having more than one constructor with
// different parameter lists.
// They are arranged in a way that each constructor performs a different task.
public class Learner {
     int id;
     String name;
     float height;

     Learner(int a, String s, float h){
          id =a;
          name =s;
          height =h;

     }
     Learner(int a, String s){
          id = a;
          name =s;

     }
     void show(){
          System.out.println(id+""+name+""+height);
     }
     public  static  void main(String args[]){
          Learner ln = new Learner(1,"Rabs", 5.23f);
          Learner ln1 = new Learner(2,"Hari");
          ln.show();
          ln1.show();


     }

}
