package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(int side, Color color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: Square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + super.color;
    }
    /* Wzór na pole kwadratu a*a */

}
