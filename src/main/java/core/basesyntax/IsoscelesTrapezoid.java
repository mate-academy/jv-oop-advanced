package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, top base: " + topBase
                + " units, bottom base: " + bottomBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
