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
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FigureType.RIGHT_TRIANGLE.getValue() + ", area: "
                + df.format(calculateArea()) + " sq.units, height: " + this.height
                + " units, base: " + this.base + " units, color: " + super.color);
    }
}
