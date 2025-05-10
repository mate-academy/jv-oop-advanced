package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units, "
                + "length: %.1f units, secondLeg: %.1f units, "
                + "color: %s%n", getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
