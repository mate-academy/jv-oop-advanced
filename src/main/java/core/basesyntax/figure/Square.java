package core.basesyntax.figure;

import core.basesyntax.Color;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + area()
                + " sq.units, side: " + side
                + " units, color: " + color.toString().toLowerCase();
    }
}
