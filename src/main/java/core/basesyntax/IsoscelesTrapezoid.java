package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double hight;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid(Color color, double hight, double lowerBase, double upperBase) {
        super("Trapezoid", color);
        this.hight = hight;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    @Override
    protected double areaCalculation() {
        return 0.5 * hight * (lowerBase + upperBase);
    }

    @Override
    public String draw() {
        return ("Figure: " + getName() + ", areа: " + areaCalculation() + " sq. units, hight: " + hight
                + " units, lowerBase: " + lowerBase + " units, upperBase: " + upperBase + " units, color: " + getColor());
    }
}
