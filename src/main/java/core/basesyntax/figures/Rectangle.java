package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RECTANGLE, area: "
                + getArea()
                + " sq.units, "
                + "side A: "
                + sideA
                + " units,"
                + " side B: "
                + sideB
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
