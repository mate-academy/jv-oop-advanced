package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double base;
    private double topBase;

    public IsoscelesTrapezoid(String color, double height, double base, double topBase) {
        super(color);
        this.height = height;
        this.base = base;
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return height * ((base * topBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + "sq. units, height: " + height + ", topBase: " + topBase
                + ", base: " + base + ", color: " + getColor());

    }
}
