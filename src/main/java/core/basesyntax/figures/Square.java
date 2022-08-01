package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double)Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + EnumFigure.SQUARE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " side: " + side + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
