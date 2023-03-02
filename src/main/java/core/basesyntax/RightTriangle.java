package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, Color: " + getColor()
                + ", Base: " + base + ", Height: " + height + ", Area: " + getArea());
    }
}
