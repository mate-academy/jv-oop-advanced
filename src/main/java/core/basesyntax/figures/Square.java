package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public class Square extends Rectangle {
    public Square(Color color, double sideLength) {
        super("square", color, sideLength, sideLength);
    }

    @Override
    public String getInfo() {
        return "Figure: " + getName()
                + ", color: " + getColor().name().toLowerCase()
                + ", area: " + round(getArea()) + " sq. units"
                + ", side length: " + round(getWidth()) + " units";
    }
}
