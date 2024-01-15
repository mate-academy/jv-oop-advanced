package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + "sq. units, base: " + base + ", height: "
                + height + ", color: " + getColor());
    }
}
