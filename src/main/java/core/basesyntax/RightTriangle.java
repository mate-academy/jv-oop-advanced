package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rigttriagle, area: "
                + getArea() + " sq. units, firatLeg : "
                + firstLeg + "units," + "secondLeg : "
                + secondLeg + "units, " + " color : "
                + getColor();
    }

}
