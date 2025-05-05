package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class Square extends Figure {
    private final int side;
    private final Color color;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: Circle" + ", area: " + area() + " sq. units"
                + ", side: " + side + " units, " + "color: " + color;
    }

    @Override
    public double area() {
        return side * side;
    }
}
