package core.basesyntax;
class Rectangle extends AbstractFigure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq. units, width:"
                        + " %.1f units, height:"
                        + " %.1f units, color: %s%n",
                getArea(), width, height, getColor());
    }
}
