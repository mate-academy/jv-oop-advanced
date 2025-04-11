package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;
    private String color;

    public RightTriangle(String color, double base, double height) {
        super(color);
        getBase();
        getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, base: " + getBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 1/2 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
