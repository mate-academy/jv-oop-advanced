package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomBase;
    private final int topBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int bottomBase, int topBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, bottom base: " + bottomBase
                + " sq.units, top base: " + topBase
                + " sq.units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) / 2.0) * height;
    }
}
