package core.basesyntax;

public class Circle extends Figure {
    double radius;

    @Override
    public double getSquare() {
        square = Math.PI * radius * radius;
        return square;
    }
}
