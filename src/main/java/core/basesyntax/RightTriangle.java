package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double HALF = 0.5;
    private int height;
    private int base;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, height: " + getHeight()
                + " units, base: " + getBase()
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return HALF * height * base;
    }
}
