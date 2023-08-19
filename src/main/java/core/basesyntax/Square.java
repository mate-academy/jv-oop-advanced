package core.basesyntax;

public class Square extends ColoredFigure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.2f sq.units, side: %.2f units, color: %s\n",
                getArea(), side, getColor());
    }
}
