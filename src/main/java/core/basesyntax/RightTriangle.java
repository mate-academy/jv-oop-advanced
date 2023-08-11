package core.basesyntax;

public class RightTriangle extends Figure {
    private final double height;
    private final double base;

    public RightTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, height: "
                + height + " units, base: " + base + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return height * base / 2;
    }
}
