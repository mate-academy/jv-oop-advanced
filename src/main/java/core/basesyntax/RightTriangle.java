package core.basesyntax;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea() + " sq.units, base: " 
                + base + ", height: " + height + ", color: " + color.name().toLowerCase());
    }
}
