package core.basesyntax.entity;

import core.basesyntax.Figure;
import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        side = new Random().nextInt(MAX_VALUE);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + super.color;
    }
}
