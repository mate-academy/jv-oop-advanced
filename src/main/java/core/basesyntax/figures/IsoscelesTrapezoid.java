package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Shape {
    private double leg;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid() {
        super();
        this.leg = random.nextInt(20) + 1;
        this.lowerBase = random.nextInt(20) + 1;
        this.upperBase = random.nextInt(20) + 1;
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
