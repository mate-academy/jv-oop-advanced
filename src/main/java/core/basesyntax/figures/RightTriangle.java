package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import java.util.Locale;

public class RightTriangle extends Figure {
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        area();
    }

    @Override
    public void area() {
        area = 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, " + "area: " + area + " sq.units, " + " firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units," + " color: " + color;
    }
}
