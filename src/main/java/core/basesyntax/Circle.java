package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    int radius;

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
