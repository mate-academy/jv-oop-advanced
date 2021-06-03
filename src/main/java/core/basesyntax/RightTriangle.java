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
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public void draw() {
        System.out.printf("Figure: right triangle, area: %1f sq.units, "
                        + "firstLeg: %2f units, secondLeg: %3f units, color: %1s%n",
                getArea(), firstLeg, secondLeg, getColor());
    }
}
