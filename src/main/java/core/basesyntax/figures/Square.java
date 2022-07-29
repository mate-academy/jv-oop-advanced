package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class Square extends Figure {

    @Override
    public double getArea() {
        return (double)Math.pow(getFirstSide(),2);
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + EnumFigure.SQUARE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " side1: " + getFirstSide() + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
