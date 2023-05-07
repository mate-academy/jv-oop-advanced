package core.basesyntax;

public class Circle extends Figure implements CalculateAble {
    double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
