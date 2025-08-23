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
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: triangle, area: %.1f sq. units, firstLeg: %.1f units, "
                        + "secondLeg: %.1f units, color: %s%n",
                getArea(), firstLeg, secondLeg, color);
    }
}
