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
    public void draw() {
        System.out.println("Figure: right triangle, area: " + roundToTwoDecimals(getArea())
                + " sq. units, first leg: " + roundToTwoDecimals(firstLeg) + " units, second leg: "
                + roundToTwoDecimals(secondLeg) + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
