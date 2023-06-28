package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name = "Right Triangle";
    private double height;
    private double base;

    public RightTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units" + getUniqueProperties()
                + ", color: " + color;

    }

    @Override
    public double getArea() {
        return height * base / 2;
    }

    @Override
    public String getUniqueProperties() {
        return ", height: " + height + " units" + ", base: "
                + base + " units";
    }
}
