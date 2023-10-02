package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double width;
    private final double height;

    public RightTriangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (width * height) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.2f sq.units, "
                + "width: %.2f units, height: %.2f units, color: %s%n",
                calculateArea(), width, height, getColor());
    }
}
