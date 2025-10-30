package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double topBase;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double topBase, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: isosceles trapezoid, area: %.2f sq. units, "
                        + "bottom base: %.2f units, "
                        + "top base: %.2f units, "
                        + "height: %.2f units, "
                        + "color: %s",
                getArea(), bottomBase, topBase, height, super.color));
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) * height) / 2;
    }
}
