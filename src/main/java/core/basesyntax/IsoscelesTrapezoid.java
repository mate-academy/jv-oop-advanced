package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double sideBase;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double sideBase, Colour colour) {
        super(colour);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.sideBase = sideBase;
    }

    public double getHigh() {
        return 0.5 * Math.sqrt(4 * sideBase * sideBase - (Math.pow(topBase - bottomBase, 2)));
    }

    @Override
    public double getArea() {
        return getHigh() / 2 * (topBase + bottomBase);
    }

    @Override
    public double getPerimeter() {
        return sideBase * 2 + topBase + bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getSideBase() {
        return sideBase;
    }

    @Override
    public String draw() {
        return String.format("IsoscelesTrapezoid: high: %.2f units, perimeter: %.2f units,"
                        + " area: %.2f units, color: %s, base top: %.2f units,"
                        + " base bot: %.2f units, base side : %.2f units.",
                getHigh(), getPerimeter(), getArea(), getColour(), topBase, bottomBase, sideBase);
    }
}
