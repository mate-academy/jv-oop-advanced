package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String drawFigure(Square square) {
        return "Figure: " + square.getName() + ", area: " + square.getArea() + " sq.units, radius: "
                + square.getSide() + " units, color: " + square.getColor();
    }
}
