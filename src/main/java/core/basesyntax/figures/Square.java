package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String showInfo() {
        return "Figure: Square, area: " + side * side + " sq.units,"
                + " side: " + side + " units, color: " + color;
    }
}
