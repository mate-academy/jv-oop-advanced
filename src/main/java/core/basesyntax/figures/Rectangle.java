package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class Rectangle extends Figure {

    @Override
    public double getArea() {
        return (double)getFirstSide() * getSecondSide();
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + EnumFigure.RECTANGLE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " side1: " + getFirstSide() + " units,"
                + " side2: " + getFirstSide() + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
