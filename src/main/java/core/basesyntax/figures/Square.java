package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;
    private final String name = "square";

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: "
                + name
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
    }
}
