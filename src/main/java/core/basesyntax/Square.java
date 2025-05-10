package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String draw() {
        return ("Figure: square, area: " + getArea() + " sg.units, side: " + side
                + " units, color: " + getColor());
    }
}
