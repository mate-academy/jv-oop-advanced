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
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: right triangle, area: %.2f sq.units, "
                        + "firstLeg: %.2f units, secondLeg: %.2f units, color: %s",
                           getArea(), firstLeg, secondLeg, color));
    }
}
