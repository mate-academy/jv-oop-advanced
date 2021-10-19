package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        setColor(color);
        this.side = side;
        setArea(side * side);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
