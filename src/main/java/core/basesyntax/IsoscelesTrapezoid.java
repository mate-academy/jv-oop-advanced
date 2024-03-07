package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final String color;
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "top base: " + topBase + " units, bottom base: " + bottomBase + " units, "
                + "height: " + height + " units, color: " + color);
    }
}
