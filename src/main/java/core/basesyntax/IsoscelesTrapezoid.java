package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double side;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double side, Color color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.round((upperBase + lowerBase + side * 2) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "trapezoid" + ", area: "
                + calculateArea() + ", upper base: " + upperBase
                + ", lower base: " + lowerBase + ", side: " + side + ", color: " + getColor());
    }
}
