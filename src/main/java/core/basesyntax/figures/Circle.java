package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Circle extends Figure {

    @Override
    public void calculatingSquare() {
        setRadius(getFields()[6]);
        setFigureArea(Math.PI * Math.pow(getRadius() * 0.5, 2));
    }

    @Override
    public String toString() {
        return "Circle, area: " + getFigureArea() + " , radius: " + getRadius()
                + ", color: " + getColor();
    }
}
