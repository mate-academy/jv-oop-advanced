package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getTheArea() {
        return side * side;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, area: "
                + getTheArea() + " sq.units, side: " + side
                + " sq.units, color: " + getColor());
    }
}
