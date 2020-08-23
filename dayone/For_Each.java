package dayone;
//for(data_type variable : array | collection){
////body of for-each loop
//}
public class For_Each {
    public  static void main(String args[]){
        int arr[]={12,13,14,44};
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        System.out.println("Total of the above number is : "+total);
    }

}
