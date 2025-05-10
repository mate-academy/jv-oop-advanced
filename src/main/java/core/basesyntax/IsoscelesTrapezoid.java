package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * 0.5 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area "
                + getArea() + " sq.units, top base: "
                + topBase + " units, bottom base: "
                + bottomBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}
