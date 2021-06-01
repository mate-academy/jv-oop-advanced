package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    double firstSide;
    double secondSide;
    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
