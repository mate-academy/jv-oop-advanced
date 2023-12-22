package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = heightCalculator();
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

    public double heightCalculator() {
        return this.height = (upperBase + lowerBase) / 2;
    }

    public double areaCalculator() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + areaCalculator() + " sq. units, upper base: "
                + getUpperBase() + " units, lower base: "
                + getLowerBase() + " units, height: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
