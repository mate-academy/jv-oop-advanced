package core.basesyntax.models;

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

    protected void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq.units, base: %.2f units, "
                        + "height: %.2f units, color: %s%n",
                getClass().getSimpleName(),
                getArea(),
                base,
                height,
                color.toLowerCase()
        );
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
