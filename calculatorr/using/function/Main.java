package calculatorr.using.function;
import java.util.Scanner;


public class Main {
    static double n1, n2;

    public static void main(String[] args) throws RuntimeException {

        SimpleCalculator calculator = new ComplexCalculator();
        Input input = calculator.getUserInput();
        char operator = input.operator;
        n1= input.n1;
        n2= input.n2;
        double result = calculator.calculate(n1,n2, operator);
        calculator.displayResult(result);


    }
//    Input call(){
//        Scanner sr = new Scanner(System.in);
//        double n = sr.nextDouble();
//        double n0 =sr.nextDouble();
//            Input io = new Input(n, n0);
//        return io;
//    }

}









