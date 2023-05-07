package core.basesyntax;

public class Rectangle extends Figure implements CalculateAble {
    private double height;
    private double weight;
    @Override
    public double getArea() {
        return height * weight;
    }
}
