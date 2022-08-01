package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double side;

    public IsoscelesTrapezoid(String color, double up, double down, double sameSides) {
        super(color);
        this.upperBase = up;
        this.lowerBase = down;
        this.side = sameSides;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getDown() {
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
                + ", firstSide: " + getUpperBase() + ", secondSide: " + getDown()
                + ", sameSides: " + getSide() + ", color: " + getColor());
    }
}
