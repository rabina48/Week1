package Encapsulation;
       //wrapping up of data under a single unit
//protective shield that prevents the data from being accessed by the code outside this shield
//Encapsulation can be achieved by:
// Declaring all the variables in the class as private and
// writing public methods in the class to set and get the values of variables

// Get method:  to access these variables.
//Set method: to set the values of the variables.

public class Bank {

    private  String  name;
    private  long checkNo;
    private  String  address;
    private  double  cash;

    public  String getName(){
        return  name;
    }

    public String getAddress(){
        return address;
    }

    public  double getCash(){
        return cash;
    }

    public  long getCheckNo(){
        return checkNo;
    }

    public  void  setName(String newName){
        name = newName;
    }

    public  void  setAddress( String newAddress){
        address = newAddress;
    }
    public  void  setCheckNo( long newCheckno){
        checkNo = newCheckno;
    }
    public  void  setCash( double newCash){
        cash = newCash;
    }


}
class  User {
    public static void  main (String[] args){
        Bank user = new Bank();
        user.setName("Rabina");
        user.setAddress("BKt");
        user.setCheckNo(2056487);
        user.setCash(500000);

        System.out.println(" Our user name "+user.getName()+" lives in "+user.getAddress()+ " and her check no is " + user.getCheckNo()+ " and she have  Rs." +user.getCash());


    }
}
