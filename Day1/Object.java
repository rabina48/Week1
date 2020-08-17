package Day1;

import java.util.zip.Adler32;

public class Object {

    String std_name;
    int std_age;
    String std_Address;
    float std_height;
    double std_GPA;
    long std_ID_no;

    //constructor
    Object(String name, int age, String Address, float height, double GPA, long ID_no){
        this.std_name=  name;
        this.std_age = age;
        this.std_Address = Address;
        this.std_height = height;
        this.std_GPA =GPA;
        this.std_ID_no =ID_no;
    }

    public  static  void main(String args[]){
        //creating object
        Object ob1 = new Object("jenny",11,"bkt",5.22f,3.33,020115156L);
//        Object ob2 = new Object("penny",27,"pbkt",5.52f,3.013,02014149L);
//        Object ob3 = new Object("senny",25,"pbkt",5.05f,3.335,021414096L);

        //Accessing object data through reference
        System.out.println(ob1.std_name+" "+ob1.std_age+" "+ob1.std_Address+" "+ob1.std_height+" "+ ob1.std_GPA+" "+ob1.std_ID_no);
//        System.out.println(ob2.std_name+" "+ob2.std_age+" "+ob2.std_Address+" "+ob2.std_height+" "+ ob2.std_GPA+" "+ob2.std_ID_no);
//        System.out.println(ob3.std_name+" "+ob3.std_age+" "+ob3.std_Address+" "+ob3.std_height+" "+ ob3.std_GPA+" "+ob3.std_ID_no);

    }
}

