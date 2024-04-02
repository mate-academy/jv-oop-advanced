package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(int side, String color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: Square, area: " + getFigureArea() + " sq. units, side: "
                + side + " units, color: " + super.color;
    }
    /* Wzór na pole kwadratu a*a */

}
