package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Shape implements Angled {
    private double leg;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid(int value1, int value2, int value3) {
        super();
        this.leg = value1;
        this.lowerBase = value2;
        this.upperBase = value3;
        if (upperBase > lowerBase) {
            double temp = upperBase;
            upperBase = lowerBase;
            lowerBase = temp;
        }
    }

    @Override
    public double getArea() {
        return getHeight() * (upperBase + lowerBase) / 2;
    }

    @Override
    public double getPerimeter() {
        return upperBase + lowerBase + leg * 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.format("Figure: isosceles trapezoid, perimeter: %.2f"
                        + ", area: %.2f"
                        + " sq. units, leg: %.2f", getPerimeter(), getArea(), getLeg());
        System.out.format(" units, lower base: %.2f"
                        + " units, upper base: %.2f"
                        + " units, color: %s.%n", getLowerBase(), getUpperBase(), getColor());

    }

    public double getLeg() {
        return leg;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getHeight() {
        return Math.sqrt(4 * Math.pow(leg, 2) - Math.pow(lowerBase - upperBase, 2));
    }
}
