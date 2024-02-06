package core.basesyntax.model;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, color: " + getColor()
                + ", base: " + base
                + ", height: " + height);
    }
}
