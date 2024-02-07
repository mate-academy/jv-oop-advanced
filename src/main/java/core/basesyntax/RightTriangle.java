package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int height, int secondValue) {
        super(color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base / 2) * height;
    }

    @Override
    public String drawFigure() {
        return ("Figure: Right Triangle, area: " + getArea() + " sq.units, base: "
                + base + " units, height: " + height + " units,  color: " + getColor());
    }
}
