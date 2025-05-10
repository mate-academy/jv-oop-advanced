package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double baseSideLen;
    private double topSideLen;
    private double height;

    public IsoscelesTrapezoid(String color, double baseSideLen, double topSideLen, double height) {
        super(color);
        this.baseSideLen = baseSideLen;
        this.topSideLen = topSideLen;
        this.height = height;
    }

    public double getBaseSideLen() {
        return baseSideLen;
    }

    public void setBaseSideLen(double baseSideLen) {
        this.baseSideLen = baseSideLen;
    }

    public double getTopSideLen() {
        return topSideLen;
    }

    public void setTopSideLen(double topSideLen) {
        this.topSideLen = topSideLen;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseSideLen + topSideLen) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area = " + getArea() + " sq.units,"
                + " base side length = " + baseSideLen + " units,"
                + " top side length = " + topSideLen + " units,"
                + " height = " + height + " units,"
                + " color = " + getColor());
    }
}
