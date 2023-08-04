package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top base: " + topBase + " units, bottom base: "
                + bottomBase + " units, height: " + height + " units, color: " + color);
    }
}
