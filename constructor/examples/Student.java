package constructor.examples;
         // default constructor  is used to provide the default values to the object like 0, null, etc., depending on the type.
public class Student {

//    Constructor name must be the same as its class name
//    A Constructor must have no explicit return type
//    A Java constructor cannot be abstract, static, final, and synchronized
             int a;
             String name;
             public  static  void main(String args[]){

                 Student st = new Student();
                 System.out.println(st.a);
                 System.out.println(st.name);

             }

}

