package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    {
        setName("right triangle");
    }

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
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
        System.out.printf("Figure: %s,"
                        + " area: %.1f sq.units, "
                        + "firstLeg: %.1f units, secondLeg: %.1f units, color: %s\n",
                getName(), getArea(), firstLeg, secondLeg, getColorString());
    }
}
