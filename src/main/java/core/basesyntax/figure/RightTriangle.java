package core.basesyntax.figure;

public class RightTriangle extends Figure {
    protected final int base;
    protected final int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) height / 2 * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + calculateArea() + " sq. units, base: "
                + base + " units, height: "
                + height + " units, color: " + color);
    }
}
