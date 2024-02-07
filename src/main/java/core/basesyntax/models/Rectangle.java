package core.basesyntax.models;

public class Rectangle extends Figure {
    private double bottom;
    private double height;

    public Rectangle(String color, double bottom, double height) {
        super(color);
        this.bottom = bottom;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    protected void setBottom(double bottom) {
        this.bottom = bottom;
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
        System.out.printf("Figure: %s, area: %.2f sq.units, bottom: %.2f units, "
                        + "height: %.2f units, color: %s%n",
                getClass().getSimpleName(),
                getArea(),
                bottom,
                height,
                color.toLowerCase()
        );
    }

    @Override
    public double getArea() {
        return bottom * height;
    }
}
