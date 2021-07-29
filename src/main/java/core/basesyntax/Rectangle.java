package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator{
    int length;
    int width;
    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return length * width;
    }
}
