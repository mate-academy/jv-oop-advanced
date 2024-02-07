package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "square, area: " + this.getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().toLowerCase();

    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return this.toString();
    }
}
