package core.basesyntax;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Rectangle, area = %.3f sq.units, first side = %.3f,"
                        + ", second side = %.3f, color - %s\n",
                calculateArea(), firstSide, secondSide, getColor());
    }
}
