package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private double leg;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid() {
        super();
        this.leg = (int) Math.random() * (11 - 1) + 1;
        this.lowerBase = (int) Math.random() * (11 - 1) + 1;
        this.upperBase = (int) Math.random() * (11 - 1) + 1;
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
        System.out.println("Figure: isosceles trapezoid, perimeter: " + getPerimeter() +
                ", area: " + getArea() +
                " sq. units, leg: " + getLeg() +
                " units, lower base: " + getLowerBase() +
                " units, upper base: " + getUpperBase() +
                " units, color: " + getColor() + ".");
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
