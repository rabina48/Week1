package constructor.examples;

   //parametrized constructor constructor which has a specific number of parameters is called a parameterized constructor.
    //to provide different values to distinct objects.
public class Teacher {
    int id;
    String name;
    String address;
    String department;
        //created a parameter constructor
    Teacher(int a, String nm, String ad, String dp) {
        id = a;
        name = nm;
        address = ad;
        department = dp;
    }

//method for display
        void display(){
            System.out.println("The teacher whose id is "+""+id+"lives in"+address+"an their name is "+name+" who is a teacher in"+department+"department" );

        }

        public static void main (String args[]){
        Teacher th= new Teacher(04,"Jenny","Kathmandu","Physics");
        Teacher th1= new Teacher(02,"rabina","Bhaktapur","Computer");
        th.display();
        th1.display();



    }
}
