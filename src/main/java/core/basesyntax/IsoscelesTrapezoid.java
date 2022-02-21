package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + getArea() + " sq.units, upperBase: "
                + upperBase
                + " units, lowerBase: "
                + lowerBase
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }
}
