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
    public void drew() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, base: " + base
                + " height: " + height
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
