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
        System.out.println("This is isosceles trapezoid with upper base - "
                + this.upperBase + ", lower base - " + this.lowerBase
                + ", leg - " + this. leg
                + ", color - " + this.getColor()
                + " and area - " + this.calcArea());
    }
}
