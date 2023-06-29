package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure : square, area: "
                + calculateArea() + " sq.units,"
                + " side: " + side + " units,"
                + " color: " + getColor();
    }
}