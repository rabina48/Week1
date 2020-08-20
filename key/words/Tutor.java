package key.words;
        //static keyword
// methods/attributes can be accessed without creating an object of a class.
public class Tutor {

        static public void teach(){
                System.out.println("Hi I am Tutor of Computer");

        }
         void fees(){
                System.out.println(" I like to teach in affordable fees");

        }
        public static void main(String[] args){
            teach();

            Tutor t = new Tutor();
               t.fees();


        }
}
