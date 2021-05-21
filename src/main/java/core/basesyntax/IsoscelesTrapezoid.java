package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double lateralSide;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public IsoscelesTrapezoid(String color, double lowerBase, double upperBase,
                              double lateralSide) {
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
        return (lowerBase + upperBase) / 2 * lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, area: "
                + getArea() + " , lower base: "
                + getLowerBase() + " , upper base " + getUpperBase()
                + " , lateral side: " + getLateralSide()
                + " , color: " + getColor());

    }
}

