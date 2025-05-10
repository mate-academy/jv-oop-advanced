package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle,"
                + " area: " + getArea()
                + " sq. units, height: "
                + height + " units, base: "
                + base + " units, color: "
                + getColor());
    }
}
