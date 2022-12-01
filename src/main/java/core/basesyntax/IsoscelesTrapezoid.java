package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int leg;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int leg) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (firstBase + secondBase + 2 * leg) / 2;
        return Math.sqrt((semiPerimeter - firstBase)
                * (semiPerimeter - secondBase)
                * (semiPerimeter - leg)
                * (semiPerimeter - leg));
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + firstBase
                + " units, second base: " + secondBase
                + " units, legs: " + leg
                + " units, color: " + color;
    }
}
