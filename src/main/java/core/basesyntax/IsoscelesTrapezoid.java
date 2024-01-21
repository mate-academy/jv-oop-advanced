package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double legs;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double legs, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.legs = legs;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * legs;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + ", upperBase: "
                + upperBase + ", lowerBase: " + lowerBase + ", leg " + legs
                + ", color: " + getColor());
    }
}
