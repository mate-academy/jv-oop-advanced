package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = (int) base;
        this.height = (int) height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, base: "
                + (int) base + ", height: " + (int)height + " units, color: " + color);

    }
}
