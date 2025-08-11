package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.2f sq. units, firstLeg: %.1f, "
                        + "secondLeg: %.1f, color: %s%n",
                getArea(), firstLeg, secondLeg, getColor());
    }
}
