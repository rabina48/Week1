package constructor.examples;
class Person{

    String name;
    String address;

    void display() {
        System.out.println(" Name=> "+name);
     //   System.out.println("Employee Salary: "+empSalary);
        System.out.println(" Address => "+address);
    }

}
class Employee extends  Person
{
     int empSalary;
    //default constructor of the class
    public Employee()
    {
        //this will call the constructor with String param
        this("rabina");// constructor invoked
    }

    public Employee(String name)
    {
        //call the constructor with (String, int) param
        this(name, 8765);
    }
    public Employee(String name, int sal)
    {
        //call the constructor with (String, int, String) param
        this(name, sal, "Delhi");

    }
    public Employee(String name, int sal, String addr)
    {
        this.name=name;
        this.empSalary=sal;
        this.address=addr;
    }
@Override // anotation
    void display() {
        //System.out.println("Employee Name: "+name);
        super.display();
        System.out.println("Salary=> "+empSalary);
        //System.out.println("Employee Address: "+address);
   }

   void show(){

   }
    public static void main(String[] args)
    {
        Person obj = new Employee();
        obj.display();
    }
}

