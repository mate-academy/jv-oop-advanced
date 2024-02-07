package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase + " units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }
}
