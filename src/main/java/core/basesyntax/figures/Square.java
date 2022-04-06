package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import java.util.Locale;

public class Square extends Figure {
    public Square(String color, int side) {
        this.color = color;
        this.side = side;
        area();
    }

    @Override
    public void area() {
        area = Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: square, " + "area: " + area + " sq.units, " + "side: " + side + " units," + " color: " + color;
    }

}
