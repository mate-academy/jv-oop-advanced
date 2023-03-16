package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(Color color, int base, int height) {
        super(color);
        this.base = (int) base;
        this.height = (int) height;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, base: "
                + (int) base + ", height: " + (int)height + " units, color: " + getColor());

    }
}
