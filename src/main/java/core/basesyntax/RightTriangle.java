package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super("RightTriangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    protected double areaCalculation() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return ("Figure: " + getName() + ", areа: " + areaCalculation()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
