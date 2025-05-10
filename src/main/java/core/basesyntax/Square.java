package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor().toLowerCase();
    }
}
