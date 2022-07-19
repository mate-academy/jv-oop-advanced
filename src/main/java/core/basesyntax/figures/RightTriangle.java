package core.basesyntax.figures;

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
        return (base * height) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + ", base: "
                + base + " units" + ", height: " + height
                + "units " + ", color: " + getColor());
    }
}
