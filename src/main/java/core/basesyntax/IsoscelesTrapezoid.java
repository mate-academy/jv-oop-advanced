package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea()
                + " sq.units, top base: "
                + topBase
                + " units, bottom base: "
                + bottomBase
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2 * height;
    }
}
