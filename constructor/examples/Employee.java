package constructor.examples;

class Employee
{
     String empName;
     int empSalary;
     String address;

    //default constructor of the class
    public Employee()
    {
        //this will call the constructor with String param
        this("rabina");
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
        this.empName=name;
        this.empSalary=sal;
        this.address=addr;
    }

    void disp() {
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
        System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}

