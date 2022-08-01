package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double side;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double side) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return upperBase * lowerBase * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + ", firstSide: " + getUpperBase() + ", secondSide: " + getLowerBase()
                + ", sameSides: " + getSide() + ", color: " + getColor());
    }
}
