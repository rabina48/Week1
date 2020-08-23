package Assocation;

public class University {
    String universityName;
    String address;

    University(String universityName, String address){
        this.universityName = universityName;
        this.address = address;
    }

    public String getUniversityName(){
        return this.universityName;
    }

    public String getUniversityAddress(){
        return this.address;
    }

}

class Department {
    String departName;
    int blockNo;

    Department(String name, int blockNo) {
        this.departName = name;
        this.blockNo = blockNo;

    }


    public String getDepartName() {

        return departName;
    }

    public int getBlockNo() {
        return getBlockNo();
    }


//    void display() {
//        System.out.println(getDepartName() + "is in " + getBlockNo());
//    }
public static void main (String[] args) {
    University university = new University("KU", "Dhulikhel");
    Department department = new Department("Computer",9);
    // department.display(); /// What could be the Error here?

    // System.out.println(university.getUniversityName()+"is in "+university.getUniversityAddress()+"and "+department.getDepartName()+"Department is in Block "+department.getBlockNo()+"ok");

    System.out.println(university.getUniversityName()+" is in "+university.getUniversityAddress()+" and "+department.getDepartName()+" Department is in Block ");
// not able to call by obj

}
}




