package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Figure: "
                + Square.class.getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
    }
}
