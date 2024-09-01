package core.basesyntax;

public class Figure implements Area, Output{
    double a, b;

    @Override
    public double findArea() {
        return a * b;
    }

    @Override
    public String printAllInformation() {
        return null;
    }
}
