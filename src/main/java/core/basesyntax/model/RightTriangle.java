package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(Color color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return height * base / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.1f", calculateArea()) // Only for better look
                + " sq.units, height: " + height
                + " units, base: " + base
                + " units, color: " + this.getColor());
    }
}
