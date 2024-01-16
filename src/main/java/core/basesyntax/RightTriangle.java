package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(Color color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + area() + "sq. units, side: " + base
                + "sq. units, height: " + "sq. color: " + getColor());
    }
}
