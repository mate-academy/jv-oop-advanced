package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: square, area: " + obtainArea() + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
