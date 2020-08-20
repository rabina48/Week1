package key.words;
        //final Keyword you cannot change the value of final variabe
    //stop value change,metod overridding, inheritance
// restrick

public class House {
     final int h=10;
    public  static void main(String[] args){
        House ho =new House();
    //    ho.h=20;// cant assign due to final key
        System.out.println(ho.h);
    }
}
