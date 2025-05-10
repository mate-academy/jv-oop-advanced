package core.basesyntax.entity.figure;

public class RightTriangle extends Figure {
    private final int height;
    private final int base;

    public RightTriangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (height * base) / 2f;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: right triangle, area: %.2f sq.units, "
                        + "color: %s, height: %d units, base: %d units.",
                getArea(), super.getColor(), height, base));
    }
}
