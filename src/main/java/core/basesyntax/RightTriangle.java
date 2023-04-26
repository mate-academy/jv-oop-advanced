package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double base;
    private final double height;

    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("Base: " + base + " units");
        System.out.println("Height: " + height + " units");
        System.out.println("Color: " + getColor());
    }
}
