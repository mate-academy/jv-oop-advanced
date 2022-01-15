package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int topBase;
    private int height;

    IsoscelesTrapezoid(Color color, int lowBase, int topBase, int height) {
        super(color);
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (lowBase + topBase) * height;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "lowBase: " + lowBase + " units, "
                + "topBase: " + topBase + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toString().toLowerCase();
    }
}
