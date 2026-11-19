package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private static final int AREA_DIVISOR = 2;

    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / AREA_DIVISOR;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + ", color: " + getColor()
                + ", base: " + base
                + ", height: " + height);
    }
}
