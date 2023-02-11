package core.basesyntax.entity.figure;

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
    public double getArea() {
        return ((topBase * bottomBase) / 2f) * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: isosceles trapezoid, area: %.2f sq.units, color: %s, "
                + "bottomBase: %d units, topBase: %d units, height: %d units.",
                getArea(), super.color, bottomBase, topBase, height));
    }
}
