package core.basesyntax;

public class RightTriangle extends CommonValues {
    private double base;

    private double height;

    private String color;

    public RightTriangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, "
                + "base: " + base + " units, height: " + height + " units, color: " + color);
    }
}
