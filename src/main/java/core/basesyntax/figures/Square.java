package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", side: " + formatValue(side) + " units"
                + ", area: " + formatValue(getArea()) + " sq.units"
                + ", color: " + color);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
