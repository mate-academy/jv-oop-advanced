package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: Square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor();
    }
    /* Wzór na pole kwadratu a*a */

}
