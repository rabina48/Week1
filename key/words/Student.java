package key.words;
      //this Key word
      // ‘this’ is a reference variable that refers to the current object.
public class Student {

      String name;
      String address;
      int id;

      Student(String n, String a, int i){
          this.name =n;
          this.address=a;
          this.id = i;
      }

      void show(){
            System.out.println("The student name is  "+name+" lives in "+address+" whose; Roll no is "+id);
      }

      public static void main(String[] args){
            Student st = new Student("Rabina","Bhaktapur",48);
            Student st1 = new Student("sabina","Kahmandu",108);
            st.show();
            st1.show();
      }
}
