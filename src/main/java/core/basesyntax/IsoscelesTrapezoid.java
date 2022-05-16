package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double side;

    {
        setName("isosceles trapezoid");
    }

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double side) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        var height = side * side - (Math.pow(bottomBase - topBase, 2) / 4);
        return (topBase + bottomBase) / 2 * Math.sqrt(height);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s,"
                        + " area: %.1f sq.units, "
                        + "top: %.1f units, bottom: %.1f units, side: %.1f units, color: %s\n",
                getName(), getArea(), topBase, bottomBase, side, getColorString());
    }
}
