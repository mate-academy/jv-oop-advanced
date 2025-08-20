package core.basesyntax;

public class RightTriangle implements Figure, Drawable {
    private final String color;
    private final int height;
    private final int base;

    public RightTriangle(String color, int height, int base) {
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, height: "
                + height + " units, base: " + base + " units, color: " + color);
    }
}
