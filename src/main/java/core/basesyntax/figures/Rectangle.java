package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Rectangle extends Figure {

    @Override
    public void calculatingSquare() {
        setFirstSide(getFields()[7]);
        setSecondSide(getFields()[8]);
        setFigureArea(getFirstSide() * getSecondSide());
    }

    @Override
    public String toString() {
        return "Rectangle, area: " + getFigureArea() + ", first side: " + getFirstSide()
                + ", second side: " + getSecondSide() + ", color: " + getColor();
    }
}
