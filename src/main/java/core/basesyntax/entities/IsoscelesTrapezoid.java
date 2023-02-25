package core.basesyntax.entities;

public class IsoscelesTrapezoid implements Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, upperBase: " + upperBase + " units, lowerBase: " + lowerBase + " units, height: " + height + " units, color: " + color);
    }
}
