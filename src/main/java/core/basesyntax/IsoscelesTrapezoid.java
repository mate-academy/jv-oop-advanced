package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, Color color) {
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
        System.out.println("Figure: isosceles trapezoid");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("Upper base: " + upperBase + " units");
        System.out.println("Lower base: " + lowerBase + " units");
        System.out.println("Height: " + height + " units");
        System.out.println("Color: " + color);
    }
}
