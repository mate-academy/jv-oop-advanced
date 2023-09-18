package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
