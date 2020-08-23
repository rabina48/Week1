package calculatorr.using.function;

public class ComplexCalculator extends SimpleCalculator{
    @Override
    public double calculate(double n1, double n2, char operator) throws RuntimeException {
        switch (operator){
            case '^':
                return power(n1, n2);

            default:
                return super.calculate(n1, n2, operator);

        }

    }

    public double power(double n1,double n2){
        return Math.pow(n1,n2);
    }
}
