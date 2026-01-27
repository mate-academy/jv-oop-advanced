package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double topBase;
    private double bottomBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(double topBase, double bottomBase,
                              double height, double leg) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + getArea()
                + ", topBase: "
                + topBase
                + ", bottomBase: "
                + bottomBase
                + ", height: "
                + height
                + ", leg: "
                + leg
                + ", color: "
                + getColor());
    }
}
