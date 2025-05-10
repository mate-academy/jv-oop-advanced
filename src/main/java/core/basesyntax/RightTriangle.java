package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " sq.units, base: "
                + base
                + " units, height: "
                + height
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
