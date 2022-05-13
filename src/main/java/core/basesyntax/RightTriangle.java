package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double COEFFICIENT = 0.5;
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return COEFFICIENT * height * base;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Right Triangle, area: %.1f sq.units,"
                        + " base: %.1f units, height: %.1f units, color: %s\n",
                getArea(), base, height, super.getColor());
    }
}
