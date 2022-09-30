package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height * (base / 2);
    }

    @Override
    public String draw() {
        return ("Figure: Right Triangle, area: " + getArea() + " sq.units, base: "
                + base + " units, height: " + height + " units,  color: " + getColor());
    }
}
