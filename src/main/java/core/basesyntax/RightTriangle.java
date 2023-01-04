package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;

    public RightTriangle(double side, Color color) {
        super(color);
        this.base = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * base * Math.sqrt(3) / 4;
    }

    @Override
    public String toString() {
        return String.format("Figure: right triangle, area: %.1f sq.units, "
                             + "base: %.1f units, color: %s",
                             getArea(), base, getColor().name().toLowerCase());
    }
}
