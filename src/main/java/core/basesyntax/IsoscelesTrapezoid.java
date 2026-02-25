package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double leg;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double leg, String color) {
        this.setColor(color);
        this.leg = leg;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    @Override
    public double calcArea() {
        double halfDifference = (lowerBase - upperBase) / 2.0;
        double height = Math.sqrt(leg * leg - halfDifference * halfDifference);
        return ((upperBase + lowerBase) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isosceles trapezoid, "
                + "area: " + calcArea() + " sq. units, "
                + "upper base :" + upperBase + " units, "
                + "lower base :" + lowerBase + " units, "
                + "leg :" + leg + " units, "
                + "color : " + getColor());
    }
}
