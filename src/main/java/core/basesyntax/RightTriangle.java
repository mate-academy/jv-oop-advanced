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
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getAreaFigure() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public String toString() {
        return "Figure: RightTriangle, area: "
                + String.format("%.2f", getAreaFigure())
                + " sq. units, firstLeg: "
                + String.format("%.0f", firstLeg)
                + " units, secondLeg: "
                + String.format("%.0f", secondLeg)
                + " units, color: "
                + getColor();
    }
}
