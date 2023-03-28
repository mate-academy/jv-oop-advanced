package core.basesyntax;

class RightTriangle extends AbstractFigure {
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
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String draw() {
        return String.format("Figure: right triangle, area: %.2f sq.units, "
                        + "width: %.2f units, height: %.2f units, color: %s",
                calculateArea(), width, height, getColor());
    }
}
