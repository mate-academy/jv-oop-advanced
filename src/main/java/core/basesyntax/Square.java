package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
