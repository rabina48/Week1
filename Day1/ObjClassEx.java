package Day1;
//object and class
public class ObjClassEx {
    //fields (or instance variable)
    String webName;
    int webAge;

    // constructor
    ObjClassEx(String name, int age){
        this.webName = name;
        this.webAge = age;
    }
    public static void main(String args[]){
        //Creating objects
        ObjClassEx obj1 = new ObjClassEx("Ram",55 );
        ObjClassEx obj2 = new ObjClassEx("giri", 18);

        //Accessing object data through reference
        System.out.println(obj1.webName+" "+obj1.webAge);
        System.out.println(obj2.webName+" "+obj2.webAge);
    }
}
