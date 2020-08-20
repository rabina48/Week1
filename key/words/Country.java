package key.words;
    //abstract is a non-access modifier
//it can extend only one class
//

abstract class Country {
    void capital() {
        System.out.println("Every country has capital");
    }
}

     class Nepal extends  Country {
        void capital() {
            System.out.println("Kathmandu is capital of Nepal");
        }
    }
class India extends  Country{
    void capital(){
        System.out.println("Delhi is capital of India");
    }
}

 class Continent{
    public  static  void  main (String[] args){
        Country c = new Nepal();
        c.capital();
        Country c1 = new India();
        c1.capital();

    }

}



