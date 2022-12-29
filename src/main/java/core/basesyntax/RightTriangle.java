package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;

    public RightTriangle(double side, Colors color) {
        super("Right Triangle", color);
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
        return getFigureInfo() + String.format(", base: %.1f units", base);
    }
}
