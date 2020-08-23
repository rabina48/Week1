package Assocation;

public class University {
    String universityName;
    String address;

    University(String name, String address){
        this.universityName = name;
        this.address = address;
    }

    public String getUniversityName(){
        return this.universityName;
    }

    public String getUniversityAddress(){
        return this.address;
    }

}

class Department{
    String departName;
    int blockNo;

    Department(String name, int blockNo){
        this.departName = name;
        this.blockNo = blockNo;

    }


    private String getDepartName(){

        return  departName;
    }

    public  int  getBlockNo(){
        return getBlockNo();
    }


//    class getLab{
//
//
//
//    }

 public static void main (String[] args) {
     University university = new University("KU", "Dhulikhel");
     Department department = new Department("Computer",9);

    // System.out.println(university.getUniversityName()+"is in "+university.getUniversityAddress()+"and "+department.getDepartName()+"Department is in Block "+department.getBlockNo()+"ok");

     System.out.println(university.getUniversityName()+" is in "+university.getUniversityAddress()+" and "+department.getDepartName()+" Department is in Block ");
// not able to call by obj

 }
 }



