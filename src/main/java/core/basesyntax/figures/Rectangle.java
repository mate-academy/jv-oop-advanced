package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", side A: " + formatValue(sideA) + " units"
                + ", side B: " + formatValue(sideB) + " units"
                + ", area: " + formatValue(getArea()) + " sq.units"
                + ", color: " + color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
