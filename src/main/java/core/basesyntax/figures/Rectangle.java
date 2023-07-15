package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double areaOfFigure() {
        return side1 * side2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: rectangle, color: " + getColor() + ", side1: " + side1
                + " units, side2: " + side2 + " units, area: " + areaOfFigure() + " sq.units");
    }
}
