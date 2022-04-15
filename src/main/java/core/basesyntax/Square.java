package core.basesyntax;

public class Square extends Figure implements Area {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return "Figure: square, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor().toLowerCase();
    }
}
