package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideLeg;
    private double upperLeg;
    private double lowerLeg;

    public IsoscelesTrapezoid(double sideLeg, double upperLeg, double lowerLeg, String color) {
        super(color);
        this.sideLeg = sideLeg;
        this.upperLeg = upperLeg;
        this.lowerLeg = lowerLeg;
    }

    @Override
    public double getArea() {
        return (((upperLeg + lowerLeg) / 2)
                * Math.sqrt(sideLeg * sideLeg - ((lowerLeg - upperLeg)
                * (lowerLeg - upperLeg)) / 4));
    }

    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %1f sq.units, "
                        + "sideLeg: %2f units, upperLeg: %3f units, "
                        + "lowerLeg: %4f units, color: %1s%n",
                getArea(), sideLeg, upperLeg, lowerLeg, getColor());
    }
}
