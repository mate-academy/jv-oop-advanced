package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public void drawTheFigure() {
        System.out.printf("Figure: square, area: %.1f sq.units, "
                + "side: %d units, color: %s%n",
                calculateArea(), side, getColor().toLowerCase());
    }
}
