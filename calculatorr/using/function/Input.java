package calculatorr.using.function;

import java.util.Scanner;

public class Input {
    double n1;
    double n2;
    char operator;

    Input(double n1, double n2, char operator) { //
        this.n1 = n1;
        this.n2 = n2;// instance variable
        this.operator = operator;

    }

    Input(double n, double n0) {
        this.n1 = n;
        this.n2 = n0;
    }



}
