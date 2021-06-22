package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double higherBase;
    private double lowerBase;
    private double high;

    public IsoscelesTrapezoid(String color, double lowerBase, double higherBase, double high) {
        super(color);
        this.lowerBase = lowerBase;
        this.higherBase = higherBase;
        this.high = high;
    }

    public double getHigherBase() {
        return higherBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double getArea() {
        return (lowerBase + higherBase) / 2 * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq.units, higher base: " + String.format("%.0f", getHigherBase())
                + " units, lower base: " + String.format("%.0f", getLowerBase())
                + " units, triangle high: " + String.format("%.0f", getHigh())
                + " units, color: " + getColor());
    }
}
