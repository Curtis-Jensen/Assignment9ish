package OlderAssignments;

public class Calculation {
    private double value1;
    private double value2;

    public double Addition(){
        value1 += value2;
        return value1;
    }

    public double Subtraction(){
        value1 -= value2;
        return value1;
    }

    public double Multiplication(){
        value1 *= value2;
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double Division(){
        value1 /= value2;
        return value1;
    }
}
