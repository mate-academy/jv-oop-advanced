package core.basesyntax;

public class Square extends Figure {
double side;

    @Override
    public double getSquare() {
        square = side*side;
        return square;
    }
}
