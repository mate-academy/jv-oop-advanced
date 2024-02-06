package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Square extends Figure {

    @Override
    public void calculatingSquare() {
        setSide(getFields()[5]);
        setFigureArea(Math.pow(getSide(), 2));
    }

    @Override
    public String toString() {
        return "Square, area: " + getFigureArea() + ", side: " + getSide()
                + ", color: " + getColor();
    }
}
