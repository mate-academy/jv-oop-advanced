package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color) {
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
