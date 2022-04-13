package core.basesyntax;

public class RightTriangle extends Figure {
    double leg1;
    double leg2;
    double hypotenuce;

    @Override
    public double getSquare() {
        square = 0.5 * leg1 * leg2;
        return square;
    }
}
