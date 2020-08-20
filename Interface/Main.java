package Interface;

public class Main {

    public  static  void main(String[] args) {
        Department department = new Department();
        department.getLoan();
        Department1 department1 = new Department1();
        department1.getLoan();

        //dynamic binding
        Bank dp = new Department1();
        department.getLoan();

    }
}
