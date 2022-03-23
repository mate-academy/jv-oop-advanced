package core.basesyntax.model;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int sideA;

    public Square(Color color, int sideA) {
        super(color);
        this.type = FigureType.SQUARE;
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameByType()
                + ", area: " + getArea() + " sq.units, side: "
                + sideA + ", color: " + getStringColor());
    }
}
