package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;
    private String color;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.color = color;
        this.base = base;
        this.height = height;
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
        return 0.5 * base * height;
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
