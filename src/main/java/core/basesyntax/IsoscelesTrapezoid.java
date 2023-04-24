package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double upperBase;
    private double lowerBase;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, upper base: "
                + upperBase
                + " units, lower base: "
                + lowerBase
                + " units, height: "
                + height
                + " units, color: "
                + color;
    }
}
