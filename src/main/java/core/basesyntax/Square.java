package core.basesyntax;
class Square extends AbstractFigure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq. units, side: %.1f units, color: %s%n",
                getArea(), side, getColor());
    }
}
