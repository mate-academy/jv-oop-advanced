package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return String.format("Figure: Rectangle, area: %.2f sq.units, firstSide: %.3f units, "
                + "secondSide: %.3f units, color: %s", getArea(), firstSide, secondSide, color);
    }

}
