package core.basesyntax;

public class Rectangle extends Figure {
    double side1;
    double side2;

    @Override
    public double getSquare() {
        square = side1 * side2;
        return square;
    }
}
