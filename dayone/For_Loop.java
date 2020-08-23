package dayone;

public class For_Loop {

    // Syntax: for(init;condition;incr/decr){
    //// code to be executed
    //}
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("value= " + i);
        }

        //For loop example to iterate an array:
        int arr[] = {2, 55, 8, 77};
        for (int r = 0; r < arr.length; r++) ;// arr.length count the value
        {
            System.out.println(arr[1]);
        }
        // all display
        int ar[] = {2, 11, 45, 9};
        for (int num : ar) {
            System.out.println(num);
        }

        //String
        String arra[] = {"hi", "bye"};
        for (String a : arra) {
            System.out.println(a);
        }

    }
}





