package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double FORMULA_HARDCODE = 0.5;
    private double height;
    private double base;

    RightTriangle(double height, double base, String color) {
        this.height = height;
        this.base = base;
        super.setColor(color);
    }

    @Override
    public void toDraw() {
        System.out.println("Type = RightTriangle, height = "
                + height + ", base = " + base + ", area = "
                + getArea() + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return FORMULA_HARDCODE * height * base;
    }
}
