package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public Double areaOfFigure() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: square, color: " + getColor() + ", side: " + side
                + " units, area: " + areaOfFigure() + " sq.units");
    }
}
