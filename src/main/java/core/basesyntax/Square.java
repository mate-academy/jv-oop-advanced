package core.basesyntax;

public class Square extends Figure implements AreaCalculator{
    double side;

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return side * side;
    }
}
