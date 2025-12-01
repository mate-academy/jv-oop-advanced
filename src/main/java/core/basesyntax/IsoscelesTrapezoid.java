package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double bottomBase;
    private final double topBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double topBase, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double area() {
        return (bottomBase + topBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " sq. units, bottomBase: "
                + this.bottomBase + " units, topBase: "
                + this.topBase + " units, height: "
                + this.height + " units, color: "
                + getColor());
    }
}
