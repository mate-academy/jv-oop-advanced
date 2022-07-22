package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public RightTriangle(String color, double secondLeg, double firstLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, "
                       + "firstLeg: %.1f units, secondLeg: %.1f units, color: %s\n",
                "right triangle", getArea(), firstLeg, secondLeg, color);
    }
}
