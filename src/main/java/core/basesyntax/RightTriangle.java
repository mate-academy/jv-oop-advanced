package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double sideA, double sideB) {
        super();
        this.firstLeg = sideA;
        this.secondLeg = sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: triangle, area: %.1f sq.units, firstLeg: %.1f units,"
                + " secondLeg: %.1f units, color: %s",
                area(), firstLeg, secondLeg, color.toLowerCase());
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }
}
