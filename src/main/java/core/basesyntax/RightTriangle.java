package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

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
    public void drawInfo() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea() + " m^2, firstLeg: "
                + firstLeg + ", secondLeg: "
                + secondLeg + ", color: "
                + getColor());
    }
}
