package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class RightTriangle extends Figure {

    @Override
    public void calculatingSquare() {
        setFirstLeg(getFields()[0]);
        setSecondLeg(getFields()[1]);
        setFigureArea(0.5 * getFirstLeg() * getSecondLeg());
    }

    @Override
    public String toString() {
        return "Right triangle, area: " + getFigureArea() + ", first leg: " + getFirstLeg()
                + ", second leg: " + getSecondLeg() + ", color: " + getColor();
    }
}
