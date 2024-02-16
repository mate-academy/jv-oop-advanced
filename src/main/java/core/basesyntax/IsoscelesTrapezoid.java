package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upper base: " + upperBase
                + " units, lower base: " + lowerBase + " units, height: "
                + height + " units, color: " + color);
    }
}
