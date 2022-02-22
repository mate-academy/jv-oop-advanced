package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

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

    @Override
    public String toString() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor();
    }
}
