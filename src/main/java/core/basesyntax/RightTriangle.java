package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculate, Drawable{

    private int base;
    private int height;

    public RightTriangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println(("Figure: right triangle, height: " + height + ", base: " + base
                + ", area: " + getArea()
                + ", color: " + getColor()));

    }
}
