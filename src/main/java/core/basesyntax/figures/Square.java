package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
