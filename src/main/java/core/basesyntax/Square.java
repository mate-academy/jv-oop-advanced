package main.java.core.basesyntax;

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

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, " + " units, color: " + getColor();
    }
}
