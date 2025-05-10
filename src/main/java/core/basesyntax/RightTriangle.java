package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(Color color, int base, int height) {
        super("right triangle", color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)(this.base) / 2 * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape()
                + ", area: " + this.getArea()
                + " sq.units, base: " + this.base
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }
}
