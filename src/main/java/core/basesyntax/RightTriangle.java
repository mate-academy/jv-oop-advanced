package core.basesyntax;

public class RightTriangle implements Figure {
    private double firstSide;
    private double secondSide;
    private String color;

    public RightTriangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + getArea()
                + " sq.units, first side: "
                + firstSide
                + " units, second leg: "
                + secondSide
                + " units, color: "
                + color;
    }
}
