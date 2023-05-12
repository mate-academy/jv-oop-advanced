package core.basesyntax;

public class RightTriangle implements Figure {
    private static final double POINT_FIVE = 0.5;
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * POINT_FIVE;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.2f sq.units, first leg: %.2f units, second leg: %.2f units, color: %s\n", getArea(), firstLeg, secondLeg, color);
    }
}
