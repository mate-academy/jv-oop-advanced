package core.basesyntax;

public class Square extends Figure {
    int side;

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + String.format("%.2f",getArea()) +
                " sq.units, side=" + side +
                ", color=" + color +
                '}';
    }
}
