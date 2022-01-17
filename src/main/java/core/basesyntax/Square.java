package core.basesyntax;

public class Square extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().toLowerCase();
    }
}
