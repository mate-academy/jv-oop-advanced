package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setArea(getArea());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, "
                        + "area: %.1f sq. units, "
                        + "firstSide: %.1f sq. units, secondSide: %.1f sq. units,"
                        + " color: %s\n",
                getArea(), firstSide, secondSide, getColor());
    }
}
