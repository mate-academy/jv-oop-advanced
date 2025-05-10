package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side = "
                + side + " units, colour: " + getColor();
    }
}
