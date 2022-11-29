package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
