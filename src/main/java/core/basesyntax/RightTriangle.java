package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, base: "
                + base + " units, height: " + height
                + " units, area: " + getArea()
                + " sq. units, color: " + this.getColor());
    }
}
