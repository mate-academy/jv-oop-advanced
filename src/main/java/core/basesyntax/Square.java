package core.basesyntax;

public class Square extends Figure implements CalculateAble {
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }
}
