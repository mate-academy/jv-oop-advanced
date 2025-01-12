package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {

    private double upperBase;
    private double lowerBase;
    private double trapezoidheight;
    private String color;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double trapezoidheight, String color) {
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.trapezoidheight = trapezoidheight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * trapezoidheight;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid [\n"
                + "Color: " + color + "\n"
                + "UpperBase: " + upperBase + "\n"
                + "LowerBase: " + lowerBase + "\n"
                + "Height: " + trapezoidheight + "\n"
                + "Area: " + getArea() + "]");
    }
}
