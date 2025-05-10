package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String color, double lowerBase, double upperBase, double height) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (lowerBase + upperBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + lowerBase
                + " units, base2: " + upperBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}
