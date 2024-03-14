package core.basesyntax;

public class SquareFigure extends AbstractFigure {
    private final double side;

    public SquareFigure(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %s sq. units, side: %s units, color: %s%n",
                getArea(),
                side,
                getColor());
    }
}
