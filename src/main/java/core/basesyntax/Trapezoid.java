package core.basesyntax;

public class Trapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double lateralSide;

    public Trapezoid(String color, double lowerBase, double upperBase, double lateralSide) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.lateralSide = lateralSide;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLateralSide() {
        return lateralSide;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * lateralSide * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, lower base: " + lowerBase
                + " units, upper base:" + upperBase
                + " units, lateral side: " + lateralSide
                + " units, color: " + getColor());
    }
}
