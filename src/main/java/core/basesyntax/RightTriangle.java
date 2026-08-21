package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
