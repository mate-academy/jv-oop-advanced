package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(int base, int height, String color) {
        this.base = base;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: right triangle, height: " + height + ", base: "
                + base + ", area: " + getArea() + ", color: " + getColor()));

    }
}
