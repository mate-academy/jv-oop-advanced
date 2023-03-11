package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println( "Figure1: right triangle, area: " + getArea() + "sq.units, firstLeg: "
                + firstLeg + "units, secondLeg: " + secondLeg + "units, color: " + getColor());
    }
}
