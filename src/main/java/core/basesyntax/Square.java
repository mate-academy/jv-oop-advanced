package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "square, area: " + getFigureArea() 
            + " sq.units, side: " + side + " units, color: " + getColor().toLowerCase();
    }
}
