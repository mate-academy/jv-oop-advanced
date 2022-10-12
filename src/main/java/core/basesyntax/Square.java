package core.basesyntax;

public class Square extends FigureColor implements Figure, AreaCalculator {
    private int side;

    public void setSquare(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
