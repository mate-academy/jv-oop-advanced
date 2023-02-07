package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String name = "trapezoid";
    private final double upperBase;
    private final double lowerBase;
    private final double side;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double side) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
    }

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double side, Colors color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.round((upperBase + lowerBase + side * 2) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + ", upper base: " + upperBase
                + ", lower base: " + lowerBase + ", side: " + side + ", color: " + getColor());
    }
}
