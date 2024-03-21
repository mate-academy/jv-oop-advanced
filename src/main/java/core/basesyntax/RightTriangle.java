package core.basesyntax;

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
        double area = 0.5 * base * height;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea() + " units, base: "
                + base + "height: " + height + " color: " + getColor());
    }
}
