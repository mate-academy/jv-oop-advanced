package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(Color color, final int base, final int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "right triangle,"
                + " area: "
                + getArea()
                + " sq.units,"
                + " base: "
                + base
                + " units, "
                + " height: "
                + height
                + " units, "
                + "color: "
                + getColor());
    }
}
