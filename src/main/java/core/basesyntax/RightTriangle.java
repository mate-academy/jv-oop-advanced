package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        this.setColor(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units, base: " + base
                + " units, height: " + height + " units, color: " + getColor());
    }
}
