package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double legC;
    private double sideLow;
    private double sideUp;

    public IsoscelesTrapezoid(String color, double legC, double sideLow, double sideUp) {
        super(color);
        this.legC = legC;
        this.sideLow = sideLow;
        this.sideUp = sideUp;
    }

    @Override
    public double calculateArea() {
        double s = getSemiperimeter();
        double dd = ((s - sideLow) * (s - sideUp) * Math.pow((s - legC), 2));
        return Math.sqrt(dd);
    }

    private double getSemiperimeter() {
        return  (sideUp + sideLow) / (2 * legC);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, area: "
                + String.format("%.2f", calculateArea())
                + " sq. units, sideLow: "
                + String.format("%.0f", sideLow)
                + " units, sideUp: "
                + String.format("%.0f", sideUp)
                + " units, legC: "
                + String.format("%.0f", legC)
                + " units, color: "
                + getColor();
    }
}
