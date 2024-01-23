package core.basesyntax;

public class RightTriangle extends AbstractFigure implements Drawable {
    private double base;
    private double height;

    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a right triangle");
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
