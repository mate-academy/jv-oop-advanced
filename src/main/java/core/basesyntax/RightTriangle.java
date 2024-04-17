package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.1f", getArea())
                + " sq. units, base: " + base + " units " + " height: " + height + " units, color: "
                + getColor());
    }
}
