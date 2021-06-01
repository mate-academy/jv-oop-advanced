package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    double firstLeg;
    double secondLeg;
    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
