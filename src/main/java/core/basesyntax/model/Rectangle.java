package core.basesyntax.model;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.type = FigureType.RECTANGLE;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameByType()
                + ", area: " + getArea() + " sq.units, side_A: "
                + sideA + ", side_B: " + sideB + ", color: " + getStringColor());
    }
}
