package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
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
        System.out.printf("Figure: right triangle, area: %.2f sq. cm, base: %.2f cm, height: %.2f "
                + "cm, color: %s.%n", getArea(), base, height, color);
    }
}
