package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(final String color, final double firstLeg, final double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: Right Triangle, "
                        + "area: %.1f sq.units, "
                        + "firstLeg: %.1f units, "
                        + "secondLeg: %.1f units, "
                        + "color: %s%n",
                this.getArea(), this.firstLeg, this.secondLeg, super.getColor()
        );

    }
}
