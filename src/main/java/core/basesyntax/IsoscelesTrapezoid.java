package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = calculateHeight();
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

    public double calculateHeight() {
        return this.height = (upperBase + lowerBase) / 2;
    }

    @Override
    public double calculateArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq. units, upper base: "
                + getUpperBase() + " units, lower base: "
                + getLowerBase() + " units, height: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
