package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return String.format("Figure: Rectangle, area: %.2f sq.units, firstSide: %.3f units, "
                + "secondSide: %.3f units, color: %s", getArea(), firstSide,
                secondSide, getColor());
    }
}
